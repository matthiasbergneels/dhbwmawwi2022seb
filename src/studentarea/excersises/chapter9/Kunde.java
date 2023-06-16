package studentarea.excersises.chapter9;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {

  String name;
  String vorname;
  Integer kundennummer;

  public static Comparator<Kunde> sortByNames = ((o1, o2) -> {
    if (o1.name.equalsIgnoreCase(o2.name) == false){
      return o1.name.compareTo(o2.name);

    }
    if (o1.vorname.equalsIgnoreCase(o2.vorname) == false){
      return o1.vorname.compareTo(o2.vorname);

    }

    return 0;


  });

  public Kunde(String name, String vorname, Integer nummer) {
    this.name = name;
    this.vorname = vorname;
    this.kundennummer = nummer;
  }

  public String getName() {
    return name;
  }

  public String getVorname() {
    return vorname;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public void setKundennummer(Integer kundennummer) {
    this.kundennummer = kundennummer;
  }

  public Integer getKundennummer() {
    return kundennummer;
  }

  @Override
  public int compareTo(Kunde o) {

      if (this.kundennummer != o.kundennummer){

        return kundennummer.compareTo(o.kundennummer);
      }

      return 0;

    }

    //equals Methode überschreiben (aus Vorlesung 16.06.)
  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null) return false;

    if (o instanceof Kunde){
      Kunde kunde = (Kunde) o;
      //Alternativ die Attribute mit sich selbst vergleichen
      if (this.compareTo(kunde) == 0) {
        return true;
      }
    }


    return false;


  }



}
