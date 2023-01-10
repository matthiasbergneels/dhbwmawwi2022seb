package lecture.chapter7;

public interface Bookable {

    int freeSlots();
    boolean book(int slotCount);
    default String reserve(int slotCount){
        return null;
    };
    default boolean book(String bookingId){
        return false;
    };
}
