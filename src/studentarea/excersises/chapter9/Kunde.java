package studentarea.excersises.chapter9;

import java.util.Comparator;
import java.util.Locale;

public class Kunde implements Comparable<Kunde>{
    private String name;
    private String vorname;
    private int kundenNummer;



    Kunde(String name, String vorname, int nummer){
        this.setName(name);
        this.setVorname(vorname);
        this.setKundenNummer(nummer);
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public String getName(){
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

  @Override
  public String toString() {
    return "Kunde{" +
      "name='" + name + '\'' +
      ", VorName='" + vorname + '\'' +
      ", kundennummer=" + kundenNummer +
      '}';
  }

  @Override
    public int compareTo(Kunde kunde){

      if (this.kundenNummer != kunde.kundenNummer) {
        return this.kundenNummer - kunde.kundenNummer;
      }
      return 0;
    }
}
