package jonst.Models.Products;

public class Meal extends Edible {
    protected String type;


    public Meal(String name, String id, int price, int calories, String[] dietaryWarnings, String type) {
        super(name, id, price, calories, dietaryWarnings, type);


    }
}
