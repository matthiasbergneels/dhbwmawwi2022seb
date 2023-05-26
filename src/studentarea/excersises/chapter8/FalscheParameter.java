package studentarea.excersises.chapter8;

public class FalscheParameter extends Exception {
    public FalscheParameter(String farbe){
        super("Ledersitze können nicht " + farbe + " sein!");
    }
}
