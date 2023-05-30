package Autositz;

public class TestAutoSitzeException extends Exception{
  public TestAutoSitzeException(boolean bezug, ErlaubteFarben farbe){
      super(" Es wurde versucht ein Autositz zu beziehen die eine Fehlerkombination enthält: \n" + "Leder: "  + bezug + "\nFarbe: " + farbe + "\nBitte beachte dass Ein Ledersitz keine andere Farbe haben kann außer " + ErlaubteFarben.SCHWARZ + " oder " + ErlaubteFarben.WEIß);
  }
}
