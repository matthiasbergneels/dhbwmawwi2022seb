package lecture.chapter7;

public class Hotel implements Bookable{

    private int roomCount;
    private int bookedRoomCount;

    public Hotel(int roomCount){
        this.roomCount = roomCount;
        this.bookedRoomCount = 0;
    }

    public void cleanRooms(){
        System.out.println("Und ich putz, putz, putz... *sing*");
    }


    @Override
    public int freeSlots() {
        return roomCount - bookedRoomCount;
    }

    @Override
    public boolean book(int slotCount) {
        if(slotCount > freeSlots()){
            return false;
        }

        bookedRoomCount += slotCount;

        return true;

    }
}

