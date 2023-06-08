package studentarea.excersises.chapter9;

public class Kunde implements Comparable<Kunde> {
    String name;
    String vorName;
    int kundenNummer;

    public Kunde(String name, String vorName, int kundenNummer){
        this.name = name;
        this.vorName = vorName;
        this.kundenNummer = kundenNummer;
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

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }


    @Override
    public int compareTo(Kunde o) {
        return this.kundenNummer - o.kundenNummer ;
    }

    @Override
    public boolean equals(Object k){
        if(this == k){
            return true;
        }
        return this.kundenNummer == ((Kunde)k).kundenNummer
                && this.name == ((Kunde)k).name
                && this.vorName == ((Kunde)k).vorName;
    }
}
