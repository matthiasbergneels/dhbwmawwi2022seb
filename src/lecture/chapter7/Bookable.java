package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public interface Bookable {

    int freeSlots();
    void book(int slotCount) throws NotEnoughFreeSlotsException;
    default String reserve(int slotCount){
        return null;
    };
    default boolean book(String bookingId){
        return false;
    };
}
