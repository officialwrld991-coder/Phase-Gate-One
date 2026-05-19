    import java.util.Scanner;

    public class TaskSix {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter Your Length: ");
    int inputOne = inputCollector.nextInt();
    
    
    System.out.print("Enter Your Width: ");
    int inputTwo = inputCollector.nextInt();
    
    int area = inputOne * inputTwo;
    
    System.out.println("The area is: " + area);

    

    }


    }
