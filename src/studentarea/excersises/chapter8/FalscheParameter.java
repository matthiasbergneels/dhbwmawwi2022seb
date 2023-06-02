package studentarea.excersises.chapter8;

public class FalscheParameter extends Exception {

    private String farbe;
    private boolean ledersitz;


    public FalscheParameter(String falscheFarbe, Boolean isLedersitz){
        super("Farbe " + falscheFarbe + " für Leder nicht verfügbar.");
        this.farbe = falscheFarbe;
        this.ledersitz = isLedersitz;

    }

    public String getFarbe(){
        return farbe;
    }

}
