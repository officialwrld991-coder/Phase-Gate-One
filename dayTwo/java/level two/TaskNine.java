    import java.util.Scanner;

    public class TaskNine{

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter your Age: ");
    int input = inputCollector.nextInt();
    
        if (input > 1 && input <= 12) {
        System.out.println("You are a child");
        }
        
        else if (input >= 13 && input <= 18) {
        System.out.println("You are a Teenager");
        }
        
        else if (input > 18) {
        System.out.println("You are an Adult");
        }
        
        else System.out.println("Invalid Age");
           

    }


    }
