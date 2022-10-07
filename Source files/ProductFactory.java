public class ProductFactory extends AbstractFactory{  //creating the factory classes that inherit AbstractFactory class
                                                     // to generate the object of concrete class
    @Override
    public GroceryProductFactory getProduct(String product) {
        if (product == null) {
            return null;
        }
        if(product.equalsIgnoreCase("Banana")){
            return new Banana();
        }
        else if(product.equalsIgnoreCase("Apples")){
            return new Apples();
        }
        return null;
    }
}
