package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    Bookable myHotel;

    @BeforeEach
    void setup(){
        myHotel = new Hotel(100);
    }

    @Test
    void bookThrowsException() {

        NotEnoughFreeSlotsException myException = assertThrows(NotEnoughFreeSlotsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                myHotel.book(120);
            }
        });

        assertEquals(100, myException.getFreeSlots());

    }

    @Test
    void bookThrowsExceptionWithLambdaFunction() {

        NotEnoughFreeSlotsException myException = assertThrows(NotEnoughFreeSlotsException.class, () -> myHotel.book(120));

        assertEquals(100, myException.getFreeSlots());

    }

    @Test
    void bookThrowsExceptionExternalClass() {

        NotEnoughFreeSlotsException myException = assertThrows(NotEnoughFreeSlotsException.class, new HotelBookExecutor((Hotel)myHotel, 120));

        assertEquals(100, myException.getFreeSlots());

    }

    @Test
    void bookDoesNotThrowsException(){
        assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                myHotel.book(myHotel.freeSlots());
            }
        });
    }

    @Test
    void bookDoesNotThrowsExceptionWithLambdaFunction(){
        assertDoesNotThrow(()-> myHotel.book(50));
    }
    
    @Test
    void bookDoesNotThrowsExceptionExternalClass(){
        assertDoesNotThrow(new HotelBookExecutor((Hotel)myHotel, 50));
    }
}
