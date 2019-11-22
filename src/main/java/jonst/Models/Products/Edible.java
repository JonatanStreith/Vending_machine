package jonst.Models.Products;

public abstract class Edible extends Product {
    protected int calories;
    protected String[] dietaryWarnings;
    protected String type;

    public Edible(String name, String id, int price, int calories, String[] dietaryWarnings, String type) {
        super(name, id, price);
        this.calories = calories;
        this.dietaryWarnings = dietaryWarnings;
        this.type = type;
    }

    @Override
    public String getDescription(){
        String description = "";

        description.concat(name + "("+id+"): " + price + " dollars. " + calories + " calories. ");
        for (String entry: dietaryWarnings) {
            if(entry.equals("sugar"))
                description.concat("Contains sugar. ");
            if(entry.equals("gluten"))
                description.concat("Contains gluten. ");
            if(entry.equals("nuts"))
                description.concat("May contain nuts. ");
            if(entry.equals("lactose"))
                description.concat("Contains lactose. ");
            if(entry.equals("caffeine"))
                description.concat("Contains caffeine. ");
            if(entry.equals("radiation"))
                description.concat("Radioactive. ");
            if(entry.equals("alcohol"))
                description.concat("Alcoholic beverage. ");
            if(entry.equals("meat"))
                description.concat("Contains meat. ");
            if(entry.equals("human flesh"))
                description.concat("Made of human flesh. ");
            if(entry.equals("hallucinatory"))
                description.concat("May cause hallucinations. ");
            if(entry.equals("hot"))
                description.concat("Contents may be hot. ");
        }

        description.concat(type + ".");

        return description;
    }

}
