package studentarea.excersises.chapter8.exercise2;

public class CarSeat {

    private boolean leatherSeat;
    private String color;

    public CarSeat(boolean leatherSeat, String color) throws WrongParameters {
        this.leatherSeat = leatherSeat;
        this.color = color;

        if (this.leatherSeat && !color.equals("black") && !color.equals("white")) {
            throw new WrongParameters(this.leatherSeat, this.color);
        }

    }

    public boolean isLeatherSeat() {
        return leatherSeat;
    }

    public String getColor() {
        return color;
    }
}
