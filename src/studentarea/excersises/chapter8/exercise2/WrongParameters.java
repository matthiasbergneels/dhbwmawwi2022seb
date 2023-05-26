package studentarea.excersises.chapter8.exercise2;

public class WrongParameters extends Exception {
    public WrongParameters(boolean leatherSeats, String color) {
        super("The combination of color %s %s leather seats is not available".formatted(color, leatherSeats ? "with" : "without"));
    }
}
