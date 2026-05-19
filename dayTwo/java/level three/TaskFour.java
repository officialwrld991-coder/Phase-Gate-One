   import java.util.Scanner;
   
   
   public class TaskFour {

    public static void main (String [] args) {
    
    Scanner inputCollector = new Scanner (System.in);
    
    System.out.print("Enter a number: ");
    int input = inputCollector.nextInt();
    
    int multiply = 1;
    
    for (int count = 1; count <= 12; count++) {
    multiply = input * count;
    System.out.println(input + " X " + count + " = " + multiply);
    }
    
    }
    
    }
