package jonst;

import jonst.Models.ProductList;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductListTest {

    @Test
    public void getProductListTest() {

    Object[] regularObjects = ProductList.getProductList();


    assertNotNull(regularObjects);

    }
}
