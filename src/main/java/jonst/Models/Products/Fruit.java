package jonst.Models.Products;

public class Fruit extends Product {
    protected String expirationDate;
    protected int calories;

    public Fruit(String name, int id, int price, String expirationDate, int calories) {
        super(name, id, price);
        this.expirationDate = expirationDate;
        this.calories = calories;
    }
}
