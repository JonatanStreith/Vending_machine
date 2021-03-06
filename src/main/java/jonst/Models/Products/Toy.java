package jonst.Models.Products;

public class Toy extends Product {
    protected int ageAndUp;

    public Toy(String name, String id, int price, int ageAndUp) {
        super(name, id, price);
        this.ageAndUp = ageAndUp;
    }

    @Override
    public String getDescription(){
        StringBuilder description = new StringBuilder();

        description.append("("+id+") " + name + ": "  + price + " dollars. ");

        description.append("Intended for ages " + ageAndUp + " and up.");

        return description.toString();
    }
}
