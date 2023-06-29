package studentarea.excersises.chapter9.uebung1;

public class Kunde implements Comparable<Kunde>{

    // TODO: Implementieren :-)

  private String name;
  private String vorname;
  private int kundenNummer;

  public Kunde(String name, String vorname, int kundenNummer) {
    this.name = name;
    this.vorname = vorname;
    this.kundenNummer = kundenNummer;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public int getKundenNummer() {
    return kundenNummer;
  }

  public void setKundenNummer(int kundenNummer) {
    this.kundenNummer = kundenNummer;
  }

  @Override
  public int compareTo(Kunde o) {
    if (this.kundenNummer != o.kundenNummer)
    {
      return this.kundenNummer - o.kundenNummer;
    }

    return 0;
  }

  @Override
  public String toString() {
    return "Kunde{" +
      "name='" + name + '\'' +
      ", vorname='" + vorname + '\'' +
      ", kundenNummer=" + kundenNummer +
      '}';
  }
}
