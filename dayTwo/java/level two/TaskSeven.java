    import java.util.Scanner;

    public class TaskSeven {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter your password: ");
    String input = inputCollector.nextLine();
    
    
    
    
        if (input.equals("admin123")) {
        System.out.println("Correct Password");
        }
        
        else System.out.println("Incorrect Password");
           

    }


    }
