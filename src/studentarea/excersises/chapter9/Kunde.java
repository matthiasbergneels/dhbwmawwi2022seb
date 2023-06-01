package studentarea.excersises.chapter9;

public class Kunde implements Comparable<Kunde> {

  private String name, vorname;
  private int kundenNummer;


  public Kunde(String name, String vorname, int nummer) {

    this.name = name;
    this.vorname = vorname;
    this.kundenNummer = nummer;

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

  public void setVorname(String name) {
    this.vorname = name;
  }

  public int getKundenNummer() {
    return kundenNummer;
  }

  public void setKundenNummer(int kundenNummer) {
    this.kundenNummer = kundenNummer;
  }

  @Override
  public int compareTo(Kunde o) {
    return this.kundenNummer - o.getKundenNummer();
  }
}
