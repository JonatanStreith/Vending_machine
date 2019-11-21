package jonst.Models.Products;

public class Toy extends Product {
    protected int ageAndUp;

    public Toy(String name, int id, int price, int ageAndUp) {
        super(name, id, price);
        this.ageAndUp = ageAndUp;
    }
}
