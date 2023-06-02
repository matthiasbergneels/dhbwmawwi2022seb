package studentarea.excersises.chapter9;

public class Kunde implements Comparable<Kunde> {

  String name;
  String vorname;
  int kundenNummer;

  public Kunde (String name, String vorname, int kundenNummer){
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
    return this.kundenNummer - o.kundenNummer;
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
