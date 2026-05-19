    import java.util.Scanner;

    public class TaskNine {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter your price: ");
    int inputOne = inputCollector.nextInt();
    
    double newPrice = inputOne - (0.1 * inputOne);
    
    System.out.println("The newPrice is: " + newPrice);

    

    }


    }
