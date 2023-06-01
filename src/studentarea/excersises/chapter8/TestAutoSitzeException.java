package studentarea.excersises.chapter8;

public class TestAutoSitzeException extends Exception{
    private String color;
    public TestAutoSitzeException(String color) {
        this.color = color;
    }
    @Override
    public String getMessage() {
        return "Leather seats are only available in black and white.\n" +
                "You tried to create leather seats in " + this.color + ". Therefore no seat object was created!\n";
    }
}
