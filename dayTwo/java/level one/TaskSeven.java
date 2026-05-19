    import java.util.Scanner;

    public class TaskSix {

    public static void main (String [] args) {


    Scanner inputCollector = new Scanner (System.in);

    System.out.print("Enter Your radius: ");
    int inputOne = inputCollector.nextInt();
    
    double circumfrence = (inputOne * inputOne) * 3.142;
    
    System.out.println("The circumfrence is: " + circumfrence);

    

    }


    }
