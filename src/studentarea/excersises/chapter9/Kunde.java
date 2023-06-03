package studentarea.excersises.chapter9;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Kunde implements Comparable<Kunde> {
  private String name;
  private String vorname;
  private int kundenNummer;

  public static Comparator<Kunde> sortByName = (kunde1, kunde2) ->{
    if(!kunde1.name.equalsIgnoreCase(kunde2.name)){
      return kunde1.name.compareTo(kunde2.name);
    }
    return kunde1.vorname.compareTo(kunde2.vorname);
  };


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

  public int compareTo(Kunde o){
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

  @Override
  public boolean equals(Object obj) {
    if(this == obj) {
      return true;
    }
    if(obj == null){
      return false;
    }
    if(this.getClass() != obj.getClass()){
      return false;
    }
    Kunde kundenObj = (Kunde)obj;
    return this.name.equals(kundenObj.name) && this.vorname.equals(kundenObj.vorname) && this.kundenNummer == kundenObj.kundenNummer;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, vorname, kundenNummer);
  }
}
