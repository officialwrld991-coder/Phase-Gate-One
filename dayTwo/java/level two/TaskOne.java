    import java.util.Scanner;

    public class TaskOne {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter a number: ");
    int input = inputCollector.nextInt();
    
        if (input % 2 == 0) {
        System.out.println("It is Even");
        }
        
        else System.out.println("It is Odd");
   
     

    }


    }
