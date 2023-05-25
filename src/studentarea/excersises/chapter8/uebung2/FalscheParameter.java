package studentarea.excersises.chapter8.uebung2;

public class FalscheParameter extends Exception
{

    public FalscheParameter(boolean ledersitze, String farbe)
    {
        super("Diese Farbkombination ist leider nicht Lieferbar");
    }

}
