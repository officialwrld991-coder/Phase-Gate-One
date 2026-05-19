   import java.util.Scanner;
   
   
   public class TaskSix {

    public static void main (String [] args) {
    
    Scanner inputCollector = new Scanner (System.in);
    
    System.out.print("Enter a number: ");
    int input = inputCollector.nextInt();
    
    int sum = 0;
        
    for (int count = 1; count <= input; count++) {
        sum += count;  
        }
        
    System.out.println(sum);
    
    }
    
    }
