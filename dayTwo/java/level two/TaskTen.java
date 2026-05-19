    import java.util.Scanner;

    public class TaskTen {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter your Age: ");
    int input = inputCollector.nextInt();
    
        if (input % 5 == 0 && input % 3 == 0) {
        System.out.println("It is divisible by 5 and 3");
        }
        
        else System.out.println("It is not divisible by 5 and 3");
           

    }


    }
