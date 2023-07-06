package studentarea.excersises.chapter10.Uebung14;

public class Einwohner implements Comparable<Einwohner> {
  private String name;
  private String vorname;
  private String gebName;
  private String eMail;
  private String anrede;
  private String familienstand;

  public Einwohner(String name, String vorname, String gebName, String eMail, String anrede, String familienstand) {
    this.name = name;
    this.vorname = vorname;
    this.gebName = gebName;
    this.eMail = eMail;
    this.anrede = anrede;
    this.familienstand = familienstand;
  }

  public String getName() {
    return name;
  }

  public String getVorname() {
    return vorname;
  }

  public String getGebName() {
    return gebName;
  }

  public String geteMail() {
    return eMail;
  }

  public String getAnrede() {
    return anrede;
  }

  public String getFamilienstand() {
    return familienstand;
  }

  @Override
  public int compareTo(Einwohner o) {
    if(this.name.compareTo(o.name) == 0)
      return this.vorname.compareTo(o.vorname);
    return this.name.compareTo(o.name);
  }

  @Override
  public String toString() {
    return "Einwohner{" +
      "name='" + name + '\'' +
      ", vorname='" + vorname + '\'' +
      ", gebName='" + gebName + '\'' +
      ", eMail='" + eMail + '\'' +
      ", anrede='" + anrede + '\'' +
      ", familienstand='" + familienstand + '\'' +
      '}';
  }
}
