//not a must for now since we have only one factory
//useful if you have many factories
public class ProductFactoryCreator { //gets the factories by passing information such as Product
    public static AbstractFactory getFactory(String option){
        if(option.equalsIgnoreCase("Grocery Products")){
            return new ProductFactory();
        }
        return null;
    }
}
