        import org.junit.jupiter.api.Test;
        
        import static org.junit.jupiter.api.Assertions.*;
        
        
        public class RangeTest {
        
        
         @Test
        
        
        public void testThatMethodReturnsTheRangeBetweenLargestAndSmallest () {
                
        int [] numbers = {14, 9, 6, 5, 8, 10};
        
        int [] range = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        
       int [] expectedRange = range;
                    
       int [] actualRange = Range.getRange(numbers);
        
        assertArrayEquals(expectedRange, actualRange);
        
        
        }
        

        
        }
