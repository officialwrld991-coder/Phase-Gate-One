        public class Function {

//Number One

        public static int [] getPrime (int [] number) {

        int [] numbers = {5,9,3,6,2};
        
        int [] prime = new int [1];
        
        int index = 0;
        
        for (int count = 0; count < numbers.length; count++) {
            
            if (numbers[count] % 2 != 0){
            prime[index] = numbers[count];
            index += 1;
            }
            
            }
            
        return prime;
        
            }
            
//Number Two

           public static int [] replaceNegative (int [] number) {
           
           int [] numbers = {5,-9,3,-6,2,-11};
           
          for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] < 0) {
                numbers[count] = 0;
            }
          
          }
          
          return numbers; 
           }
           
//Number Four

        public static int [] getDuplicate (int [] number) {
        
        int [] numbers = {45,60,3,0,67,2,45,3,22,0};
        
        int [] duplicate = new int [2];
        
        int num = 0;
        
        for (int count = 0; count < numbers.length; count++) {
        for (int index = count + 1; index < numbers.length; index++) {
            if (numbers[count] == number[index]) {
            duplicate[num] = numbers[count];
             num += 1;
            }
           
        }
        } 
        
        return duplicate;
        }



        



