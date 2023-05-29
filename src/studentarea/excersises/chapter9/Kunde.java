package studentarea.excersises.chapter9;

public class Kunde {
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
}
