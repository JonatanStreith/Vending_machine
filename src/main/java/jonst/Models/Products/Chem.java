package jonst.Models.Products;

public class Chem extends Product {

    String effect;
    int duration;

    public Chem(String name, String id, int price, String effect, int duration) {
        super(name, id, price);
        this.effect = effect;
        this.duration = duration;
    }

    @Override
    public String getDescription(){
        String description = "";

        description.concat(name + "("+id+"): " + price + " dollars. ");

        description.concat(effect + " for " + duration + " minutes.");

        return description;
    }
}
