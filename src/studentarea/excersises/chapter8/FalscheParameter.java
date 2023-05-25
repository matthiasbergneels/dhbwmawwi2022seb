package studentarea.excersises.chapter8;

public class FalscheParameter extends Exception{
    private boolean ledersitze;
    private String farbe;

    public FalscheParameter(boolean ledersitze, String farbe) {
        super("Nein! Leder in Farbe:"+ farbe+"nicht lieferbar!");
        this.ledersitze = ledersitze;
        this.farbe = farbe;
    }
}
