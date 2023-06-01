package studentarea.excersises.chapter8;

public class FalscheParameter extends Exception {

  public FalscheParameter(String farbe, boolean istLeder) {
    super("Die Kombination aus " + (istLeder ? "Leder" : "Stoff") + " und der Farbe " + farbe + " ist ungültig");
  }

}


