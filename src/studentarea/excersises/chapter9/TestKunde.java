package studentarea.excersises.chapter9;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestKunde {
    public static void main(String[] args) {
        Kunde klaus = new Kunde( "Mustermann", "Klaus", 4711);
        Kunde hans = new Kunde( "Beispiel", "Hans", 5180);
        Kunde hilde = new Kunde( "Mustermann", "Hilde", 4712);
        Kunde theodor = new Kunde( "Vorbild", "Theodor", 8278);
        Kunde jimmy = new Kunde( "Dummy", "Jimmy", 1111);



        Set<Kunde> kundenSet = new TreeSet<>();
        kundenSet.add(klaus);
        kundenSet.add(hans);
        kundenSet.add(hilde);
        kundenSet.add(theodor);
        kundenSet.add(jimmy);

        Iterator<Kunde> i = kundenSet.iterator();
        while(i.hasNext()) {
            Kunde kunde = i.next();
            System.out.println(kunde.getKundenNummer() + " " + kunde.getVorName() + " " + kunde.getName());
        }

        System.out.println("\n==================================");
        System.out.println("Ausgabe Vector:\n");

        List<Kunde> kundenListe = new Vector<>(kundenSet);
        kundenListe.sort(new CompareWithName());

        Iterator<Kunde> j =  kundenListe.iterator();

        while (j.hasNext()){
            Kunde kunde = j.next();
            System.out.println(kunde.getKundenNummer() + " " + kunde.getName() + " " + kunde.getVorName());
        }



    }



}
