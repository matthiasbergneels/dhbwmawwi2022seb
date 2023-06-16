package studentarea.excersises.chapter9;
import java.util.Comparator;
public class Kunde implements Comparable<Kunde>{
    private String name;
    private String vorname;
    private int kundennummer;
    public static Comparator<Kunde> compareName = (k1, k2) ->{
        if (!k1.name.equalsIgnoreCase(k2.name)){
            return k1.name.toUpperCase().compareTo(k2.name.toUpperCase());
        }
        if (!k1.vorname.equalsIgnoreCase(k2.vorname)){
            return k1.vorname.toUpperCase().compareTo(k2.vorname.toUpperCase());
        }
        return 0;
    };// Das ist cool, weil man auf die lambda-funk zugreifen kann ohne getter, weil in der Klasse selbst
    public Kunde(String name, String vorname, int kundennummer) {
        this.name = name;
        this.vorname = vorname;
        this.kundennummer = kundennummer;
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

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    @Override
    public int compareTo(Kunde o) {
        return this.kundennummer - o.getKundennummer();
    }
    @Override
    public boolean equals(Object o){
        if (o == null)return false;
        if (o.getClass() != this.getClass()) return false;
        if (!this.name.equalsIgnoreCase(((Kunde) o).name)) return false;
        if (!this.vorname.equalsIgnoreCase(((Kunde) o).vorname)) return false;
        if (this.kundennummer != ((Kunde) o).kundennummer) return false;
        return true;
        //so würde ich das in die Production schicken
    }
}
