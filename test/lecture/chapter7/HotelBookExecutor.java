package lecture.chapter7;

import org.junit.jupiter.api.function.Executable;

public class HotelBookExecutor implements Executable {

    private Hotel myHotel;

    public HotelBookExecutor(Hotel myHotel){
        this.myHotel = myHotel;
    }
    @Override
    public void execute() throws Throwable {
        myHotel.book(120);
    }
}
