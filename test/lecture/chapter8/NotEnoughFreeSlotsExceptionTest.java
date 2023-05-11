package lecture.chapter8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotEnoughFreeSlotsExceptionTest {

    @Test
    void NotEnoughFreeSlotsExceptionGeneration(){
        NotEnoughFreeSlotsException myException = new NotEnoughFreeSlotsException(80, 100);

        Assertions.assertEquals("Es wurde versucht 100 Plätze zu buchen. Es sind nur 80 frei.", myException.getMessage());
        Assertions.assertEquals(80, myException.getFreeSlots());
    }

}