package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class AirPlane implements Bookable{

    private boolean[] seats;        // true --> Booked, false --> Free

    public AirPlane(int seatCount){
        this.seats = new boolean[seatCount];
    }

    public void fly(){
        System.out.println("und ich flieg, flieg, flieg... *sing*");
    }

    @Override
    public int freeSlots(){
        int freeSlots = 0;

        for(boolean seat : seats){
            if(!seat){
                freeSlots++;
            }
        }

        return freeSlots;
    }

    @Override
    public void book(int slotCount) throws NotEnoughFreeSlotsException, NullPointerException {
        if(slotCount > freeSlots()){
            throw new NotEnoughFreeSlotsException(freeSlots(), slotCount);
        }

        for(int i = 0; i < seats.length; i++){
            if(!seats[i]){
                seats[i] = true;    // <-- booked seat
                slotCount--;
            }

            if(slotCount == 0){
               break;
            }
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return "Flugzeug mit " + seats.length + " Plätzen, davon " + freeSlots() + " frei.";
    }
}
