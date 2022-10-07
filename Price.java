import java.io.File;
import java.util.Scanner;

abstract class Price {  //abstract class that has the methods needed by the classes
    protected double amount;
    public class readFile {
        private Scanner scan;
        public void openFile(){
            try{
                scan = new Scanner(new File("Products.txt"));
            }
            catch(Exception e){
                System.out.println("Product prices are currently unavailable");
            }
        }
        public void readFile(){
            while(scan.hasNext()){
                String a = scan.next();
                String b = scan.next();
            }
        }
    }
    abstract void getAmount();

    public void calculateTotal(int quantity){
        System.out.printf("%,.2f", amount*quantity);
    }

}

