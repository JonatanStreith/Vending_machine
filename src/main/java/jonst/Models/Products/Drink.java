package jonst.Models.Products;

public class Drink extends Product {
    protected int calories;
    protected boolean sugarfree;
    protected String type;

    public Drink(String name, int id, int price, int calories, boolean sugarfree, String type) {
        super(name, id, price);
        this.calories = calories;
        this.sugarfree = sugarfree;
        this.type = type;
    }
}
