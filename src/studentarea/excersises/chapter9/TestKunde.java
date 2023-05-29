package studentarea.excersises.chapter9;
import java.util.*;


public class TestKunde {
    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Musteramann", "Klaus", 4711);
        Kunde kunde2 = new Kunde("Beispiel", "Hans", 5180);
        Kunde kunde3 = new Kunde("Musteramann", "Hilde", 4712);
        Kunde kunde4 = new Kunde("Vorbild", "Theodor", 8278);
        Kunde kunde5 = new Kunde("Dummy", "Jimmy", 1111);


        Set<Kunde> kundenListe = new TreeSet<>();
        kundenListe.add(kunde1);
        kundenListe.add(kunde2);
        kundenListe.add(kunde3);
        kundenListe.add(kunde4);
        kundenListe.add(kunde5);




    }


}
