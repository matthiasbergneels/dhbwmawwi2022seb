package studentarea.excersises.chapter8;

public class TestAutoSitzeException {

  public static void main(String[] args) {
    testAutoSitze("Leder", "Schwarz");
    testAutoSitze("Stoff", "Blau");
    testAutoSitze("Leder", "Rot");
  }

  private static void testAutoSitze(String material, String farbe) {
    try {
      AutoSitze autoSitze = new AutoSitze(material, farbe);
      System.out.println("Der Autositz wurde erfolgreich mit " + autoSitze.getMaterial() + " in der Farbe " + autoSitze.getFarbe() + " bezogen.");
    } catch (FalscheParameter e) {
      System.out.println("Das Beziehen des Autositzes ist fehlgeschlagen: " + e.getMessage());
    }
  }
}
