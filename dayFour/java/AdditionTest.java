        import org.junit.jupiter.api.Test;
        
        import static org.junit.jupiter.api.Assertions.*;
        
        
        public class AdditionTest {
        
        
         @Test
        
        
        public void testThatMethodAddsTwoNumbersAndReturnsASpecificFigure () {
        
        int [] numbers = new int [5];
        
        int number =numbers [0] + numbers [4];
        
        int [] sum = {8, -2, 0, 0, 0};
        
       int [] expectedSum = sum;
                    
       int [] actualSum = Addition.addNumbers(numbers, number);
        
        assertArrayEquals(expectedSum, actualSum);
        
        
        }
        
//         @Test
//        
//        
//        public void testThatMethodAddsTwoNumbersAndReturnsASpecificFigure () {
//        
//        int [] numbers = new int [7];
//        
//        int number =numbers [2] + numbers [3];
//        
//        int add = 0;
//        
//        int [] sum = {5, 7, 0, 0, 0, 0, 0};
//        
//       int [] expectedSum = sum;
//                    
//       int [] actualSum = Addition.addNumbers(numbers, number);
//        
//        assertArrayEquals(expectedSum, actualSum);
//        
//        
//        }
        
        }
