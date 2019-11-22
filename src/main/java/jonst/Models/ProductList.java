package jonst.Models;

import jonst.Models.Products.*;

import java.util.Arrays;

public class ProductList {

    private static Product[] productList = new Product[]
            {
                    //Candy
                    new Candy("Dandy Boy Apples", "cDB", 5, 20, new String[]{"sugar"}, "Preserved fruit"),
                    new Candy("Fancy Lads Snack Cakes", "cFS", 10, 200, new String[]{"sugar, nuts, gluten"}, "Snack"),
                    new Candy("Sugar Bombs", "cSB", 30, 2000, new String[]{"sugar, lactose, gluten"}, "Cereal"),
                    new Candy("Gum drops", "cGD", 1, 5, new String[]{}, "Candy"),
                    new Candy("Mushroom cloud", "cMC", 5, 35, new String[]{"radiation"}, "Snack"),

                    //Drinks
                    new Drink("Nuka-Cola", "dNC", 3, 50, new String[]{"sugar", "radiation"}, "Cold, carbonated drink"),
                    new Drink("Aqua Pura", "dAP", 10, 0, new String[]{}, "Cold drink"),
                    new Drink("Sunset Sarsaparilla", "dSS", 5, 50, new String[]{"sugar"}, "Cold drink"),
                    new Drink("Atomic Cocktail", "dAC", 25, 10, new String[]{"sugar, radiation, alcohol"}, "Cold, alcoholic drink"),
                    new Drink("Nuka-Cola Quantum", "dNQ", 15, 60, new String[]{"sugar, radiation"}, "Cold drink"),
                    new Drink("Wasteland coffee", "dWC", 21, 30, new String[]{"caffeine, hot"}, "Hot drink"),

                    //Food
                    new Meal("Squirrel on a stick", "mSQ", 7, 50, new String[]{"meat, radiation, hot"}, "Cooked meal"),
                    new Meal("Insta-Mash", "mIM", 6, 80, new String[]{"gluten", "radiation"}, "Non-prepared meal"),
                    new Meal("Junk food", "mJF", 5, 120, new String[]{"sugar, gluten, radiation, peanuts, lactose"}, "Ready to eat meal"),
                    new Meal("Strange meat", "mSM", 25, 60, new String[]{"meat", "human flesh"}, "Raw meal"),
                    new Meal("YumYum Deviled Eggs", "mDE", 5, 20, new String[]{"lactose", "gluten", "radiation"}, "Ready to eat meal"),

                    //Fruits
                    new Fruit("Mutfruit", "fMF", 10, 75, new String[]{"sugar", "radiation"}, "Fruit"),
                    new Fruit("Cave fungus", "fCF", 2, 10, new String[]{}, "Fungus"),
                    new Fruit("Punga fruit", "fPF", 15, 35, new String[]{"sugar", "hallucinatory"}, "Fruit"),
                    new Fruit("Xander root", "fXR", 2, 5, new String[]{}, "Herb"),

                    //Toys
                    new Toy("Vault-Tec Bobblehead", "tVB", 100, 5),
                    new Toy("Toy truck", "tTT", 75, 3),
                    new Toy("Teddy bear", "tTB", 125, 1),
                    new Toy("'Grognar the Barbarian' comic", "tGC", 250, 5),
                    new Toy("Baseball and glove", "tBG", 75, 4),


                    //Chems
                    new Chem("Mentats", "chM", 300, "+2 Int, +2 Per, +1 Cha", 20),
                    new Chem("Jet", "chJ", 25, "+15 action points", 4),
                    new Chem("Buffout", "chB", 200, "+2 Str, +2 Agi, +1 End", 20),
                    new Chem("Psycho", "chP", 150, "+25% damage", 4),
                    new Chem("Med-X", "chMX", 150, "+25% damage resistance", 4),
                    new Chem("Stimpak", "chSP", 75, "+25 health", 1),
                    new Chem("Super Stimpak", "chSSP", 175, "+100 health", 1),
                    new Chem("Rad-X", "chRX", 300, "+25 radiation resistance", 20),
                    new Chem("Rad-Away", "chRA", 500, "-25 rads", 1)

            };


    public static Product[] getProductList(){


        return Arrays.copyOf(productList, productList.length);

    }

}
