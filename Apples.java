public class Apples implements GroceryProductFactory { //concrete class implementing the bank interface
    private final String PName;

    public Apples() {
        PName = "Apples";
    }

    @Override
    public String getProductName() {
        return PName;
    }
}
