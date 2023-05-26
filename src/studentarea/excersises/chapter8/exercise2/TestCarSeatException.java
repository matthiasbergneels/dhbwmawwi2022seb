package studentarea.excersises.chapter8.exercise2;

public class TestCarSeatException {

    public static void main(String[] args) {

        try {
            CarSeat testedCarSeat = new CarSeat(false, "blue");
            System.out.printf("car seat - color: %s | leather: %s", testedCarSeat.getColor(), testedCarSeat.isLeatherSeat());
        } catch (WrongParameters e) {
            System.out.println(e.getMessage());
            System.out.println("covering car seat failed");
        }
    }
}
