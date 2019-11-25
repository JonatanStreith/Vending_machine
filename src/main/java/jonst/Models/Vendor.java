package jonst.Models;

import jonst.Models.Products.Product;

import java.util.Arrays;
import java.util.Scanner;

public class Vendor implements VendingMachine {

    private int depositPool;

    Product[] productList;
    Product[] purchaseList;

    private boolean vendorActive;

    public static Scanner inputReader;

    public Vendor() {


        productList = ProductList.getProductList();     //Get the list of products
        purchaseList = new Product[0];



    }

    public void runVendor(){


        inputReader = new Scanner(System.in);
        vendorActive = true;


        System.out.println("Welcome to Wasteland Wendor! Your outlet for affordable post-apocalyptic commodities!\n");

        while (vendorActive) {


            displayOptions();          //Display menu

            String[] choice = getChoice();      //Gets user input as array of words

            handleResponse(choice);     //Process the choice

        }
        inputReader.close();
    }

    public void displayMenu() {
        System.out.println("\nOur current offers: ");

        for (String product : getProducts()) {
            System.out.println(product);
        }
        System.out.println("\n");
    }

    public void displayOptions() {

        System.out.println("\n");
        System.out.println("To see the menu, please type 'menu'.");
        System.out.println("To learn more about a product, please type 'desc [product code]'.");
        System.out.println("To purchase a product using deposited funds, please type 'buy [product code]'.");
        System.out.println("To deposit more money, please type 'deposit [amount]'. (Legal tender only.)");
        System.out.println("To return deposited money, please type 'return'.");
        System.out.println("For more help, please type 'help'.");
    }

    public String[] getChoice() {

        System.out.print("\nCurrent funds: " + depositPool + " dollars. Your choice: ");
        return inputReader.nextLine().split(" ");       //Reads a line from user, then splits it into array based on space, then returns array
    }

    public void handleResponse(String[] choice) {

        switch (choice[0]) {

            case "menu":
                displayMenu();
                break;

            case "desc":
                System.out.println(getDescription(choice[1]));
                break;

            case "buy":
                purchase(choice[1]);
                break;

            case "deposit":
                addCurrency(choice[1]);
                break;

            case "return":
                returnDeposit();
                break;

            case "help":
                help();
                break;

            case "purchases":
                listPurchases();
                break;

            case "quit":
                endSession();
                break;

            default:
                System.out.println("I'm sorry, I didn't understand that.");
                break;


        }


    }

    public void returnDeposit() {

        String returnsLine = getReturnsLine(depositPool);

        System.out.println(returnsLine);

        depositPool = 0;
    }

    public String getReturnsLine(int deposit){

        int[] moneyArray = new int[8];

        StringBuilder outputLine = new StringBuilder("You receive ");


        for (int i = LegalTender.values().length - 1; i >= 0; i--) {
            int denomination = Integer.parseInt(LegalTender.values()[i].getValue());    //Get the denomination of the current bill
            int numberOfBills = (int) Math.floor(deposit / denomination);         //Count how many full bills we can get out of the depositPool
            moneyArray[i] = numberOfBills;                                              //Add the bills to the correct place in the array
            deposit -= (numberOfBills * denomination);                           //Adjust depositPool to account for removed money


            if (numberOfBills > 0) {
                outputLine.append(numberOfBills + " " + denomination + " dollar " + (numberOfBills > 1 ? "bills, " : "bill, "));
            }

        }

        return outputLine.toString();

    }


    public void listPurchases() {
        System.out.println("You have purchased:");

        for (Product purchase : purchaseList) {
            System.out.println(purchase.getName());
        }

    }


    public void addToPurchaseList(Product product) {
        purchaseList = Arrays.copyOf(purchaseList, purchaseList.length + 1);
        purchaseList[purchaseList.length - 1] = product;
    }

    public void purchase(String productCode) {
        Product currentPurchase = request(productCode);

        if (currentPurchase.getPrice() <= depositPool) {    //Assuming user can afford this!
            System.out.println("An excellent choice! Please retrive your " + currentPurchase.getName() + " from the deposit slot.");
            addToPurchaseList(currentPurchase);
            depositPool -= currentPurchase.getPrice();  //Decrease funds


            //Perhaps track all purchases?

        } else {
            System.out.println("Insufficient funds, sorry.");
        }
    }


    public void help() {
        System.out.println("Legitimate commands are: 'menu', 'desc', 'buy', 'purchases', 'deposit', 'return', 'help', 'quit'.");
        System.out.println("Legitimate currency units are: 1, 5, 10, 20, 50, 100, 500, 1000.");
    }


    @Override
    public void addCurrency(String amount) {

        boolean legitimateTender = false;

        for (LegalTender value : LegalTender.values()) {
            if (value.getValue().equals(amount)) {
                depositPool += Integer.parseInt(amount);
                System.out.println("You deposit " + amount + " dollars.");
                legitimateTender = true;
                break;
            }
        }

        if (!legitimateTender)
            System.out.println("That's not a legitimate unit of currency, sorry!");
    }

    @Override
    public Product request(String productCode) {

        for (Product product : productList) {
            if (product.getId().toLowerCase().equals(productCode.toLowerCase()))
                return product;
        }

        return null;
    }

    @Override
    public int endSession() {

        System.out.println("Thank you for shopping at Wasteland Wendor! War never changes... and neither do our prices!");

        vendorActive = false;
        return 0;
    }

    @Override
    public String getDescription(String productCode) {
        for (Product prod : productList) {
            if (prod.getId().toLowerCase().equals(productCode.toLowerCase())) {
                return prod.getDescription();
            }
        }

        return "No product with that code exists in the system.";
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public String[] getProducts() {
        String[] returnArray = new String[productList.length];

        for (int i = 0; i < productList.length; i++) {
            returnArray[i] = productList[i].display();      //Gets a summary of the item: "(id) Name: Price".
        }


        return returnArray;
    }


//-----Getters and setters


    //Kinda don't want to have these, but they're needed for testing

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }

    public Product[] getProductList() {
        return productList;
    }


    public Product[] getPurchaseList() {
        return purchaseList;
    }


    public boolean isVendorActive() {
        return vendorActive;
    }

    public void setVendorActive(boolean vendorActive) {
        this.vendorActive = vendorActive;
    }



}