package studentarea.excersises.chapter8;

public class AutoSitze {
    private boolean ledersitze;
    private ErlaubteFarben farbe;

    public AutoSitze(boolean bezug, ErlaubteFarben color) throws TestAutoSitzeException{

        if (bezug && !(color == ErlaubteFarben.SCHWARZ || color == ErlaubteFarben.WEIß))  {
            throw new TestAutoSitzeException(bezug, color);
        }
        setFarbe(color);
        setLedersitze(bezug);
        System.out.println("Ein neuer Sitz wurde gebaut!");
    }

    public ErlaubteFarben getFarbe() {
        return farbe;
    }

    public void setFarbe(ErlaubteFarben farbe) {
        this.farbe = farbe;
    }

    public boolean isLedersitze() {
        return ledersitze;
    }

    public void setLedersitze(boolean ledersitze) {
        this.ledersitze = ledersitze;
    }
}
