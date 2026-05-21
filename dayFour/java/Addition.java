        public class Addition {
        
        public static int [] addNumbers (int [] numbers, int number) {
        
        int [] input = {8, 6, 12, 4, -2};
        
        int [] added = new int [input.length];
        
        int add = 6;
        
        int newCount = 0;
        
        
        for (int count = 0; count < input.length; count++) {
        
        for (int index = count + 1; index < input.length; index++) {
        
        if (input[count] + input[index] == add) {
        
        added[newCount] = input[count];
        
        newCount += 1;        
        
        added[newCount] = input[index];
            
        
        } 
        
        else continue;
        
        }
        
        }
        
        return added;

        }
        
        }
