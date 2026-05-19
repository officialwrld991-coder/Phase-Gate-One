    import java.util.Scanner;

    public class TaskFive {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter Your Temperature in Celcius: ");
    int inputOne = inputCollector.nextInt();
    
    double farenheit = ((inputOne * (9/5))) + 32;
    
    System.out.println("The temperature in Farenheit is: " + farenheit);

    

    }


    }
