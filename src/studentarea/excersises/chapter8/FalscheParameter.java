package studentarea.excersises.chapter8;

public class FalscheParameter extends Exception {
    String farbe;
    public FalscheParameter(String farbe){
        super("Für Ledersitze steht die Farbe" + farbe + "nicht zur auswahl");

    }
}
