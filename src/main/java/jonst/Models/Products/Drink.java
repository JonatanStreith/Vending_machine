package jonst.Models.Products;

public class Drink extends Edible {

    protected String type;

    public Drink(String name, String id, int price, int calories, String[] dietaryWarnings, String type) {
        super(name, id, price, calories, dietaryWarnings, type);

    }


}
