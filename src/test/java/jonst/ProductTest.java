package jonst;

import static org.junit.Assert.*;

import jonst.Models.Products.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ProductTest {

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
    public void displayTest() {


        String display = manualArray[3].display();
        String expected = "(pi) Pineapple: 25 dollars.";


        assertEquals(expected, display);

    }
    @Test
    public void descriptionTest() {


        String description = manualArray[3].getDescription();
        String expected = "(pi) Pineapple: 25 dollars. 500 calories. Contains sugar. Tropical.";


        assertEquals(expected, description);

    }

}
