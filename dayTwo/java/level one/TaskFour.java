    import java.util.Scanner;

    public class TaskFour {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter first number: ");
    int inputOne = inputCollector.nextInt();
    
    System.out.print("Enter second number: ");
    int inputTwo = inputCollector.nextInt();


    int newInput = inputOne * inputTwo;
    
    System.out.println("The product is: " + newInput);


    }


    }
