package studentarea.excersises.chapter9;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {
    private String name;
    private String vorname;
    private int kundenNummer;

    Kunde(String name, String vorname, int kundenNummer) {
        this.name = name;
        this.vorname = vorname;
        this.kundenNummer = kundenNummer;
    }

    public static Comparator<Kunde> sortByName = (Kunde o1, Kunde o2) -> {
        if (!o1.name.equals(o2.name))
            return o1.name.compareTo(o2.name);
        if (!o1.vorname.equals(o2.vorname))
            return o1.vorname.compareTo(o2.vorname);
        return 0;
    };

    public String getName() {
        return this.name;
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getKundenNummer() {
        return this.kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public void setName(String name) {
        this.name = name;
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
        if (o == this)
            return true;

        if (o instanceof Kunde k) {
            return this.kundenNummer == k.kundenNummer && this.name.equals(k.name) && this.vorname.equals(k.vorname);
        }
        return false;
    }

    @Override
    public int compareTo(Kunde o) {
        if (this.kundenNummer != o.kundenNummer)
            return this.kundenNummer - o.kundenNummer;
        return 0;
    }
}
