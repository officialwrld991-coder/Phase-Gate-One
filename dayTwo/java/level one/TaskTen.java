    import java.util.Scanner;

    public class TaskTen {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter a number: ");
    int inputOne = inputCollector.nextInt();
    
     System.out.print("Enter a number: ");
    int inputTwo = inputCollector.nextInt();
    
     System.out.print("Enter a number: ");
    int inputThree = inputCollector.nextInt();
    
    
    double average = (inputOne * inputTwo * inputThree) / 3;
    
    System.out.println("The average is: " + average);

    

    }


    }
