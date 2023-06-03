package studentarea.excersises.chapter9;

public class TestVergleichKunde {
  public static void main(String[] args) {
    Kunde vergleichsKunde1 = getStandartKunde();
    Kunde vergleichsKunde2 = getStandartKunde();
    Kunde vergleichsKunde3 = new Kunde("notDefault", "Kunde", 1234);

    boolean result1 = vergleichsKunde1.equals(vergleichsKunde2);
    boolean result2 = vergleichsKunde1.equals(vergleichsKunde3);

    System.out.println(result1);
    System.out.println(result2);
  }

  static Kunde getStandartKunde(){
    return new Kunde("Default", "Kunde", 1234);
  }
}
