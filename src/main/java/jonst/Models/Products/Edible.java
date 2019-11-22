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
        StringBuilder description = new StringBuilder();

        description.append("("+id+") " + name + ": "  + price + " dollars. " + calories + " calories. ");
        for (String entry: dietaryWarnings) {
            if(entry.equals("sugar"))
                description.append("Contains sugar. ");
            if(entry.equals("gluten"))
                description.append("Contains gluten. ");
            if(entry.equals("nuts"))
                description.append("May contain nuts. ");
            if(entry.equals("lactose"))
                description.append("Contains lactose. ");
            if(entry.equals("caffeine"))
                description.append("Contains caffeine. ");
            if(entry.equals("radiation"))
                description.append("Radioactive. ");
            if(entry.equals("alcohol"))
                description.append("Alcoholic beverage. ");
            if(entry.equals("meat"))
                description.append("Contains meat. ");
            if(entry.equals("human flesh"))
                description.append("Made of human flesh. ");
            if(entry.equals("hallucinatory"))
                description.append("May cause hallucinations. ");
            if(entry.equals("hot"))
                description.append("Contents may be hot. ");
        }

        description.append(type + ".");

        return description.toString();
    }

}
