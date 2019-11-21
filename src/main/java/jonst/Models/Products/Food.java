package jonst.Models.Products;

public class Food extends Product {
    protected String type;
    protected int calories;

    public Food(String name, int id, int price, String type, int calories) {
        super(name, id, price);
        this.type = type;
        this.calories = calories;
    }
}
