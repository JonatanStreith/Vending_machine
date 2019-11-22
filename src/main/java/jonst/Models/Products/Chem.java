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
        StringBuilder description = new StringBuilder();

        description.append("("+id+") " + name + ": "  + price + " dollars. ");

        description.append(effect + " for " + duration + " minutes.");

        return description.toString();
    }
}
