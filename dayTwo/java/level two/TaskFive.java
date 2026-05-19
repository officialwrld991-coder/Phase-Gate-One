    import java.util.Scanner;

    public class TaskFive {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter first number: ");
    int inputOne = inputCollector.nextInt();
    
    System.out.print("Enter second number: ");
    int inputTwo = inputCollector.nextInt();
    
    System.out.print("Enter third number: ");
    int inputThree = inputCollector.nextInt();
    
    int largest = inputOne;
    
        if (inputTwo > largest) {
        largest = inputTwo;
        }
        
        else if (inputThree > largest) {
        largest = inputThree;
        }
        
       System.out.println("Largest Number is: "+ largest);
   
     

    }


    }
