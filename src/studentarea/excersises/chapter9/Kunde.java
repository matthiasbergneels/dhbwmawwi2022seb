package studentarea.excersises.chapter9;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {

  public static Comparator<Kunde> sortByFamilyname = Comparator.comparing((Kunde p) -> p.getName().toLowerCase()).thenComparing(p -> p.getVorname().toLowerCase());

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
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (object == null) {
      return false;
    }

    if (object.getClass() != this.getClass()) {
      return false;
    }

    if (((Kunde) object).getKundenNummer() != this.getKundenNummer()) {
      return false;
    }

    if (((Kunde) object).getName() != this.getName()) {
      return false;
    }

    return ((Kunde) object).getVorname() == this.getVorname();
  }

  @Override
  public int compareTo(Kunde o) {
    return this.kundenNummer - o.getKundenNummer();
  }
}
