package lecture.chapter7;

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
    public boolean book(int slotCount){
        if(slotCount > freeSlots()){
            return false;
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
        return true;
    }

}
