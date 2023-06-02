package studentarea.excersises.chapter8;

public class AutoSitze {
    private boolean ledersitze;
    private String farbe;

    AutoSitze(boolean bezug, String color) throws FalscheParameter {

        if (bezug == true) {
            if (color.equals("Schwarz") == false & color.equals("Weiß") == false) {
                throw new FalscheParameter(color, bezug);
            }
        }

        this.farbe = color;
        this.ledersitze = bezug;
    }

    public String getFarbe() {
        return farbe;
    }

    public boolean isLedersitze() {
        return ledersitze;
    }



}
