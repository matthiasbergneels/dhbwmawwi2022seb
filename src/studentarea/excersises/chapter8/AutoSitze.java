package studentarea.excersises.chapter8;

public class AutoSitze {
    private boolean ledersitze;
    private String farbe;

    public AutoSitze(boolean bezug, String color) throws FalscheParameter{
        if (bezug == false || (bezug == true && (color.equals("Schwarz") || color.equals("Weiß")))){
            this.ledersitze = bezug;
            this.farbe = color;
        }else{
            throw new FalscheParameter(bezug, color);
        }
    }

    public String getFarbe() {
        return farbe;
    }

    public boolean isLedersitze() {
        return ledersitze;
    }
}
