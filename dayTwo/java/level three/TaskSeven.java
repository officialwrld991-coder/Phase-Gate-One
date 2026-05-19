   import java.util.Scanner;
   
   
   public class TaskSeven {

    public static void main (String [] args) {
    
    Scanner inputCollector = new Scanner (System.in);
    
    int sum = 0;
        
    for (int count = 1; count <= 5; count++) {
        System.out.print("Enter a number: ");
        int input = inputCollector.nextInt();
        
        sum += input;  
        }
        
    System.out.println("The total Sum is: "sum);
    
    }
    
    }
