package lecture.chapter8;

public class NotEnoughFreeSlotsException extends Exception{

    private int freeSlots;
    private int slotsToBook;

    public NotEnoughFreeSlotsException(int freeSlots, int slotsToBook){
        super("Es wurde versucht " + slotsToBook + " Plätze zu buchen. Es sind nur " + freeSlots + " frei.");
        this.freeSlots = freeSlots;
        this.slotsToBook = slotsToBook;
    }

    public int getFreeSlots(){
        return freeSlots;
    }
}
