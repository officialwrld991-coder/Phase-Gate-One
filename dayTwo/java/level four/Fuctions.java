    public class Function {
//Number One

    public static int addNumber (int numberOne, int numberTwo) {
    
    int sum = numberOne + numberTwo;
    
    return sum;
    
    }
    
//Number Two

    public static int checkEven (int number) {
    if (number % 2 == 0) {
    return number;
    }
    else return 0;
    }
    
//Number Three

    public static int getSquare (int number) {
    
    int square = number * number;
    
    return square;
    
    }
    
//Number Four

    public static double converter (int number) {
    
    double farenhiet = ((number * (9/5)) + 32);
    
    return farenhiet
    
    }
    
//Number Six

    public static int getLargest (int numberOne, int numberTwo, int numberThree) {
    
   int largest = numberOne;
   
   if (numberTwo > largest) {
       largest = numberTwo;
   }
   
   else if (numberThree > largest) {
        largest = numberThree;   
   }
   
   return largest;
    
    }
    
//Number Seven
    
    public static double getIntrest (int principal, int rate, int time) {
    
    double interest = (principal * rate * time) / 100;
    
    return interest;
    
    }
    
//Number Eight    
    
    public static int getArea (int length, int width) {
    
    int area = length * width;
    
    return area;
    }
    
//Number Nine    
    
    public static int [] getReverse (int number) {
    
    int [] reverse = new int[number.length];
    
    while (number >= 0) {
        int remainder = number % 10;
        reverse[count] = remainder;
        number = number / 10;        
    }
    
    return reverse;
    
    }
    
//Number Ten

    public static int getDuplicate (String name) {
    int Occourence = 0;
    for (int count = 0; count < name.length; count++) {
    for (int index = count + 1; index < name.length; index++){
        if name.charAt(count).equals(name.charAt(index)) {
        Occourence += 1;
        }
    }
    }
    
    return Occourence;
    
    }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
