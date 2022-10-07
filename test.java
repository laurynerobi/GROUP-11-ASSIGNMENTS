import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class test {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("******* Welcome to The Hood Grocery Shop *******: ");
        System.out.println("Enter the product name: ");   //user inputs product name
        String productName = br.readLine();
        System.out.print("\n");
        AbstractFactory productFactory = ProductFactoryCreator.getFactory("Grocery Products");  //getting the factory for Grocery products
        GroceryProductFactory g = productFactory.getProduct(productName); //using the grocery product interface to create the factories of the products and accessing them using the abstract class
                                                                          //matching user input with the current product classes we have and creating that product

        //Getting the price
        GetPriceFactory priceFactory = new GetPriceFactory();
        System.out.println("Enter the product price name: BananaPrice  or ApplesPrice");
        BufferedReader my_br=new BufferedReader(new InputStreamReader(System.in));
        String priceName=my_br.readLine();

        System.out.print("Enter the number of fruits for price to be calculated: ");
        int quantity=Integer.parseInt(my_br.readLine());

        Price p = priceFactory.getPrice(priceName);
        //calling the getPrice() method and calculateTotal()method
        System.out.println("The product chosen is: " +g.getProductName());
        System.out.println("The total "+priceName+ " for " +quantity+ " items is: ");
        p.getAmount();
        p.calculateTotal(quantity);


    }

}
