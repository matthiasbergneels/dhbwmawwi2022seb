package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class Hotel implements PriorityBookable, Comparable, Cloneable{

    private int roomCount;
    private int bookedRoomCount;
    private int reservedRoomCount;
    private String[] bookingIds = new String[5];

    public Hotel(int roomCount){
        this.roomCount = roomCount;
        this.bookedRoomCount = 0;
    }

    public void cleanRooms(){
        System.out.println("Und ich putz, putz, putz... *sing*");
    }


    @Override
    public int freeSlots() {
        return roomCount - (bookedRoomCount + reservedRoomCount);
    }

    @Override
    public void book(int slotCount) throws NotEnoughFreeSlotsException {
        if(slotCount > freeSlots()){
            throw new NotEnoughFreeSlotsException(freeSlots(), slotCount);
        }

        bookedRoomCount += slotCount;
    }

    @Override
    public String reserve(int slotCount) {
        if(slotCount > freeSlots()){
            return null;
        }

        reservedRoomCount += slotCount;

        return "BookingId1";
    }

    @Override
    public String toString() {
        return "Hotel mit " + roomCount + " Räumen, davon " + freeSlots() + " frei";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean bookWithPriority(int slotCount) {
        return false;
    }
}

