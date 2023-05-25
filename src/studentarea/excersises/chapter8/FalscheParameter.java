package studentarea.excersises.chapter8;

public class FalscheParameter extends IllegalArgumentException {
    public FalscheParameter(String farbe) {
        super("Die Kombination Ledersitze und " + farbe + " ist nicht möglich.");
    }
}
