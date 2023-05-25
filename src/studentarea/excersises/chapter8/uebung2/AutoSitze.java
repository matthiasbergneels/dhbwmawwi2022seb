package studentarea.excersises.chapter8.uebung2;

public class AutoSitze
{

    private boolean ledersitze;
    private String farbe;

    public AutoSitze(boolean ledersitze, String farbe) throws FalscheParameter
    {
        this.ledersitze = ledersitze;
        this.farbe = farbe;

        if(this.ledersitze && !farbe.equals("Schwarz") && !farbe.equals("Weiß"))
        {
            throw new FalscheParameter(this.ledersitze, farbe);
        }
        else if(this.ledersitze)
        {
            System.out.println("Die Ledersitze mit der Farbe " + farbe + " werden bezogen");
        }
        else
        {
            System.out.println("Die Stoffsitze mit der Farbe " + farbe + " werden bezogen");
        }
    }

    public boolean isLedersitze() {
        return ledersitze;
    }

    public String getFarbe() {
        return farbe;
    }
}
