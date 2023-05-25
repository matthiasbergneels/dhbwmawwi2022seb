package studentarea.excersises.chapter8;

public class AutoSitze {
    private boolean ledersitze;
    private Farbe farbe;

    //public AutoSitze(boolean bezug, String color) throws FalscheParameter {
    public AutoSitze(boolean bezug, Farbe color) throws FalscheParameter {
        if(bezug && !(color == Farbe.Schwarz || color == Farbe.Weiß))
            throw new FalscheParameter(bezug, color);

        this.ledersitze = bezug;
        this.farbe = color;
    }

    public boolean isLedersitze() {
        return ledersitze;
    }

    public Farbe getFarbe() {
        return this.farbe;
    }
}
