package lecture.chapter7;

public class AirPlane {

    private boolean[] seats;        // true --> Booked, false --> Free

    public AirPlane(int seatCount){
        this.seats = new boolean[seatCount];
    }

    public void fly(){
        System.out.println("und ich flieg, flieg, flieg... *sing*");
    }
    
}
