package studentarea.excersises.chapter8;

public class AutoSitze {
    private final boolean leatherSeats;
    private String color;

    public AutoSitze(String color, boolean leatherSeats) throws TestAutoSitzeException{
        this.leatherSeats = leatherSeats;
        this.color = color;
        if (!isValidSeat(color, leatherSeats)){ throw new TestAutoSitzeException(color); }

        giveConstructionTextOut(color, leatherSeats);
    }

    private void giveConstructionTextOut(String color, boolean leatherSeats) {
        String outputText = leatherSeats ? "Seats" : "Leather seats";
        outputText += " in " + color + " were created.";
        System.out.println(outputText);
    }

    private boolean isValidSeat(String color, boolean leatherSeats) {
        return !leatherSeats || (color.equals("Black") || color.equals("White"));
    }
    public String getColor(){ return this.color; }
    public boolean isLeatherSeat(){ return this.leatherSeats; }
}
