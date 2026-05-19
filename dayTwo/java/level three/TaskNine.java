import java.util.Scanner;
   
   
   public class TaskNine {

    public static void main (String [] args) {
    
     Scanner inputCollector = new Scanner (System.in);
    
    System.out.print("Enter a number: ");
    int input = inputCollector.nextInt();
    
    
    for (int count = 0; count < input; count++) {
    
        for(int star = 0; star <= count; star++) {
        System.out.print("*");
        
        }
    
    System.out.println();
    
    }
    
    }
    }
