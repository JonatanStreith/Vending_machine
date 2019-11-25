package jonst;

import static org.junit.Assert.*;

import jonst.Models.Products.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ProductTest {      //Tests all Product-inheriting classes for working constructors and methods

    Product[] manualArray;

    @Before
    public void initialize() {
        manualArray = new Product[]{
                new Candy("Bubblegum", "bg", 5, 5, new String[]{"sugar"}, "Candy"),
                new Chem("Placebo", "pl", 500, "Nothing!", 5),
                new Drink("Fanta", "fa", 15, 150, new String[]{"sugar"}, "Soda"),
                new Fruit("Pineapple", "pi", 25, 500, new String[]{"sugar"}, "Tropical"),
                new Meal("Pad thai", "pt", 95, 450, new String[]{"gluten"}, "Asian"),
                new Toy("Fidget spinner", "fs", 45, 5)
        };
    }

    @Test
    public void createAllProductsTest() {


        assertNotNull(manualArray);
        assertNotNull(manualArray[0]);
        assertEquals("Fanta", manualArray[2].getName());

    }

    @Test
    public void GettersTest() {


        String name = manualArray[3].getName();
        String id = manualArray[3].getId();
        int price = manualArray[3].getPrice();



        assertEquals("Pineapple", name);
        assertEquals("pi", id);
        assertEquals(25, price);

    }

    @Test
    public void displayTest() {


        String display = manualArray[3].display();
        String expected = "(pi) Pineapple: 25 dollars.";


        assertEquals(expected, display);

    }
    @Test
    public void descriptionTest() {



        assertEquals("(pi) Pineapple: 25 dollars. 500 calories. Contains sugar. Tropical.", manualArray[3].getDescription());
        assertEquals("(fs) Fidget spinner: 45 dollars. Intended for ages 5 and up.", manualArray[5].getDescription());
        assertEquals("(pl) Placebo: 500 dollars. Nothing! for 5 minutes.", manualArray[1].getDescription());

    }

}
