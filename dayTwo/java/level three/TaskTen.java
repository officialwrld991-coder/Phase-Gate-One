import java.util.Scanner;
   
   
   public class TaskTen {

    public static void main (String [] args) {
    
     Scanner inputCollector = new Scanner (System.in);
    
    System.out.print("Enter a number: ");
    int input = inputCollector.nextInt();
    
    int count = 0;
    
    while (input != 0) {
    int rem = input % 10;
    count += 1;
    
    input = input / 10;
    
    }
    
    System.out.println(count);
    
    
    }    
    }
