package lecture.chapter7;

public class Hotel {

    private int roomCount;
    private int bookedRoomCount;

    public Hotel(int roomCount){
        this.roomCount = roomCount;
        this.bookedRoomCount = 0;
    }

    public void cleanRooms(){
        System.out.println("Und ich putz, putz, putz... *sing*");
    }


}

