package jonst.Models.Products;

public abstract class Product {

    private static Product[] productList = new Product[0];

    protected String name;
    protected String id;
    protected int price;

    public Product(String name, String id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String display(){
        return ("("+ id +") " + name + ": " + price + " dollars.");
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
