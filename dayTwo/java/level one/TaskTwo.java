    import java.util.Scanner;

    public class TaskTwo {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter your age: ");
    int input = inputCollector.nextInt();

    int newAge = input + 5;
    
    System.out.println("In 5 years, you will be " + newAge + " years old.");


    }


    }
