   import java.util.Scanner;
   
   
   public class TaskEight {

    public static void main (String [] args) {
    
    Scanner inputCollector = new Scanner (System.in);
    
    int sum = 0;
    
    System.out.print("Enter a number and Zero to Stop: ");
    int input = inputCollector.nextInt();
        
    while (input > 0) {
        sum += input; 
        System.out.print("Enter a number and Zero to Stop: ");
        int inputTwo = inputCollector.nextInt();
        
        input = inputTwo;
                
        }
        
    System.out.println("The total Sum is: "+sum);
    
    }
    
    }
