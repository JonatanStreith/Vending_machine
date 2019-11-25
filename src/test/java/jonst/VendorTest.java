package jonst;

import jonst.Models.Products.Fruit;
import jonst.Models.Products.Product;
import jonst.Models.Vendor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendorTest {

    Vendor vendor;

    @Before
    public void initialize() {

        vendor = new Vendor();
    }

    @Test
    public void constructorTest() {

        assertNotNull(vendor);
        assertNotNull(vendor.getProductList());
        assertNotNull(vendor.getPurchaseList());


    }


    @Test
    public void runVendor() {

        //Only initiates a loop that takes input and runs other methods. Too complex to be tested discretely.

    }


    @Test
    public void displayMenuTest() {

        //Only outputs a bunch of lines, nothing to test

    }


    @Test
    public void displayOptionsTest() {

        //Only outputs a bunch of lines, nothing to test

    }

    @Test
    public void getChoiceTest() {

        //Reads input, can't be tested

    }

    @Test
    public void handleResponseTest() {

        //Runs other methods, doesn't do much of itself that can be tested

    }

    @Test
    public void returnDepositTest() {

        vendor.setDepositPool(5000);

        vendor.returnDeposit();

        assertTrue(vendor.getBalance() == 0);

    }

    @Test
    public void getReturnLineTest() {

        String result = vendor.getReturnsLine(5000);

        assertEquals("You receive 5 1000 dollar bills, ", result);

    }

    @Test
    public void listPurchasesTest() {

        //just outputs lines

    }

    @Test
    public void addToPurchaseListTest() {

        //A test product
        Fruit apple = new Fruit("Apple", "ap", 12, 500, new String[]{"sugar"}, "sweet fruit");

        vendor.addToPurchaseList(apple);

        assertEquals(apple, vendor.getPurchaseList()[0]);

    }

    @Test
    public void purchaseTest() {

        vendor.purchase("chB"); //Should fail since we lack the money

        assertFalse(vendor.getPurchaseList().length > 0);

        vendor.setDepositPool(500);
        vendor.purchase("chB");

        assertTrue(vendor.getPurchaseList().length > 0);
        assertNotNull(vendor.getPurchaseList()[0]);
        assertEquals("chB", vendor.getPurchaseList()[0].getId());
    }

    @Test
    public void helpTest() {

        //Just prints lines


    }

    @Test
    public void addCurrencyTest() {

        vendor.addCurrency("73");   //Should fail

        assertFalse(vendor.getBalance() == 73);

        vendor.addCurrency("500");
        vendor.addCurrency("20");

        assertTrue(vendor.getBalance() == 520);
    }

    @Test
    public void requestTest() {

        Product test = vendor.request("dNC");

        assertNotNull(test);
        assertEquals("dNC", test.getId());
        assertEquals("Nuka-Cola", test.getName());

    }


    @Test
    public void endSessionTest() {

        vendor.setVendorActive(true);

        vendor.endSession();

        assertFalse(vendor.isVendorActive());

    }

    @Test
    public void getDescriptionTest() {

        String desc = vendor.getDescription("dNC");
        String expected = "(dNC) Nuka-Cola: 3 dollars. 50 calories. Contains sugar. Radioactive. Cold, carbonated drink.";
        assertEquals(expected, desc);

        desc = vendor.getDescription("nonsense");
        expected = "No product with that code exists in the system.";
        assertEquals(expected, desc);

    }

    @Test
    public void getBalanceTest() {

        int result = vendor.getBalance();
        assertEquals(0, result);

        vendor.setDepositPool(500);

        result = vendor.getBalance();
        assertEquals(500, result);
    }

    @Test
    public void getProductsTest() {

        String[] results = vendor.getProducts();
        String expectedLine3 = "(cSB) Sugar Bombs: 30 dollars.";

        assertNotNull(results);
        assertTrue(results.length > 0);
        assertEquals(expectedLine3, results[2]);

    }




}
