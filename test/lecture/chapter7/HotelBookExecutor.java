package lecture.chapter7;

import org.junit.jupiter.api.function.Executable;

public class HotelBookExecutor implements Executable {

    private Hotel myHotel;
    private int slotsToBook;

    public HotelBookExecutor(Hotel myHotel, int slotsToBook){
        this.myHotel = myHotel;
    }
    @Override
    public void execute() throws Throwable {
        myHotel.book(slotsToBook);
    }
}
