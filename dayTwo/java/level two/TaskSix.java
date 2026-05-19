    import java.util.Scanner;

    public class TaskSix {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter a year: ");
    int input = inputCollector.nextInt();
    
    
    
    
        if (input % 4 == 0) {
        System.out.println("It is a leap year");
        }
        
        else System.out.println("It is not a leap year");
           

    }


    }
