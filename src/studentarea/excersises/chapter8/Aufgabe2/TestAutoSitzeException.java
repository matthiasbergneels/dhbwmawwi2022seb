package studentarea.excersises.chapter8.Aufgabe2;

public class TestAutoSitzeException {
  public static void main(String[] args) {
    try {

      new AutoSitze(true, "Blau");
      System.out.println("Ging alles gut");

    } catch (FalscherParameterException ex) {
      System.out.println(ex.getMessage());
      System.out.println("Die Kombination ist fehlgeschlagen.");
    }


  }
}
