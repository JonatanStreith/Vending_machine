package jonst.Models;

import jonst.Models.Products.Product;

public interface VendingMachine {


    void addCurrency(String amount);

    Product request(String productCode);

    int endSession();

    String getDescription(String productCode);

    int getBalance();

    String[] getProducts();
}
