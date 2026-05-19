    import java.util.Scanner;

    public class TaskTwo {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter a number: ");
    int input = inputCollector.nextInt();
    
        if (input <= 0) {
        System.out.println("It is Negative");
        }
        
        else System.out.println("It is Positive");
   
     

    }


    }
