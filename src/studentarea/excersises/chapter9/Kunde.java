package studentarea.excersises.chapter9;

public class Kunde implements Comparable<Kunde> {

    // TODO: Implementieren :-)

  private String name;
  private String vorname;
  private int kundenNummer;

  public Kunde(String name, String vorname, int nummer){
    this.name = name;
    this.vorname = vorname;
    this.kundenNummer = nummer;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }
  public String getVorname() {
    return vorname;
  }

  public void setKundenNummer(int kundenNummer) {
    this.kundenNummer = kundenNummer;
  }
  public int getKundenNummer() {
    return kundenNummer;
  }


  @Override
  public int compareTo(Kunde kunde) {
    return this.kundenNummer - (kunde.getKundenNummer());
  }
}
