package jonst.Models.Products;

public class Candy extends Product {
    protected int calories;
    protected boolean sugarfree;

    public Candy(String name, int id, int price, int calories, boolean sugarfree) {
        super(name, id, price);
        this.calories = calories;
        this.sugarfree = sugarfree;
    }
}
