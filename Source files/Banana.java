public class Banana implements GroceryProductFactory { //concrete class implementing the bank interface
    private final String PName;

    public Banana() {
        PName = "Banana";
    }

    @Override
    public String getProductName() {
        return PName;
    }
}
