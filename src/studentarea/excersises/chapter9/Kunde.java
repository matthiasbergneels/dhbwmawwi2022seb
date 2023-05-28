package studentarea.excersises.chapter9;

import java.util.Objects;

public class Kunde implements Comparable<Kunde> {
    String name, vorname;
    int kundenNummer;

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
    public int compareTo(Kunde k) {
        return Integer.compare(this.getKundenNummer(), k.getKundenNummer());
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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Kunde kunde = (Kunde) o;
        return kundenNummer == kunde.kundenNummer && Objects.equals(name, kunde.name) && Objects.equals(vorname, kunde.vorname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vorname, kundenNummer);
    }
}
