package studentarea.excersises.chapter8;

public class AutoSitze {
    private boolean ledersitze;
    private String farbe;

    public AutoSitze(boolean bezug, String color) throws FalscheParameter{
        if(bezug && !(color.equalsIgnoreCase("schwarz") || color.equalsIgnoreCase("weiß"))){
            throw new FalscheParameter(color);
        }
        ledersitze = bezug;
        farbe = color;
    }

    public boolean isLedersitze() {
        return ledersitze;
    }

    public String getFarbe() {
        return farbe;
    }
}
