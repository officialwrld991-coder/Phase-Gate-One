        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

        
        
        public class ParkingSystemTest {

        @Test

        public void testThatTheMethodTakesNumberInAnArray(){
        
        int [] park = new int [20];
        
        int [] expectedSlot = park;
        
        int [] actualSlot = ParkingSystem.getNumber(park);
        
        assertArrayEquals(expectedSlot, actualSlot);
        
        }
        
        @Test
        
        public void thatThatTheUserEntersOneToOccupyACarSpace() {
        
        int [] park = new int [20];
        
        park[10] = 1;
        
        int [] expectedSlot = park;
        
        int [] actualSlot = ParkingSystem.getSpace(park);
        
        assertArrayEquals (actualSlot, expectedSlot);
        
        }
        
        
         @Test
        
        public void thatThatTheMethodReturnsOccupiedIfItIs() {
        
        int [] park = new int [20];
        
        int occupied =  1;
        
        String expectedSlot = "It is Occupied";
        
        String actualSlot = ParkingSystem.getReserved(occupied);
        
        assertEquals (actualSlot, expectedSlot);
        
        }
        
        
        
        
        }

