package jonst.Models.Products;

public class Product {

    private static Product[] productList = new Product[0];

    protected String name;
    protected int id;
    protected int price;

    public Product(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
}
