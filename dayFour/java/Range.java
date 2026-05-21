        public class Range {
        
        public static int [] getRange (int [] numbers) {
        
        int [] input = {14, 9, 6, 5, 8, 10};
        
        int highest = input[0];
                       
        for (int index = 1; index < input.length; index++) {
        
        if (input[index] > highest) {
        
        highest = input[index];               
        
        } 
              
        }
        
        int smallest = input[0];
        
        for (int count = 1; count < input.length; count++) {
        
        if (input[count] < smallest) {
        
        smallest = input[count];
                
        }
        
        }
        
        int [] output = new int [(highest-smallest) + 1];
        
        for (int num = 0; num < output.length; num++) {
                output[num] = smallest + num;      
        }
        
        return output;
        
        }
        

        }
        
