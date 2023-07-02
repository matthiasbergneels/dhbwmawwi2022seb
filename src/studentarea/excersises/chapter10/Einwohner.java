package studentarea.excersises.chapter10;

public class Einwohner implements Comparable {
  private String name;
  private String vorName;
  private String gebName;
  private String eMail;
  private Anrede anrede;
  private String familienStand;


  public Einwohner(String name, String vorName, String gebName, String eMail, Anrede anrede, String familienStand) {
    this.name = name;
    this.vorName = vorName;
    this.gebName = gebName;
    this.eMail = eMail;
    this.anrede = anrede;
    this.familienStand = familienStand;
  }

  @Override
  public int compareTo(Object o) {
    if(!this.name.equalsIgnoreCase(((Einwohner)o).name)){
      return this.name.toUpperCase().compareTo(((Einwohner)o).name.toUpperCase());
    }
    if(!this.vorName.equalsIgnoreCase(((Einwohner)o).vorName)){
      return this.vorName.toUpperCase().compareTo(((Einwohner)o).vorName.toUpperCase());
    }
    return 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVorName() {
    return vorName;
  }

  public void setVorName(String vorName) {
    this.vorName = vorName;
  }

  public String getGebName() {
    return gebName;
  }

  public void setGebName(String gebName) {
    this.gebName = gebName;
  }

  public String geteMail() {
    return eMail;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }

  public Anrede getAnrede() {
    return anrede;
  }

  public void setAnrede(Anrede anrede) {
    this.anrede = anrede;
  }

  public String getFamilienStand() {
    return familienStand;
  }

  public void setFamilienStand(String familienStand) {
    this.familienStand = familienStand;
  }


}
