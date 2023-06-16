package studentarea.excersises.chapter9;

import java.util.*;

public class TestKunde {
    public static void main(String[] args) {
        Kunde K1 = new Kunde("Mustermann", "Klaus", 4711);
        Kunde K2 = new Kunde("Beispiel", "Hans", 5180);
        Kunde K3 = new Kunde("Mustermann", "Hilde", 4712);
        Kunde K4 = new Kunde("Vorbild", "Theodor", 8278);
        Kunde K5 = new Kunde("Dummy", "Jimmy", 1111);

        Kunde K11 = new Kunde("Mustermann", "Klaus", 4711);

        Set<Kunde> KundenSet = new TreeSet<>();
        KundenSet.add(K1);
        KundenSet.add(K2);
        KundenSet.add(K3);
        KundenSet.add(K4);
        KundenSet.add(K5);

        //TreeSet Ausgabe
        System.out.println("TreeSet");
        Iterator<Kunde> iS = KundenSet.iterator();
        while(iS.hasNext()){
            Kunde aKunde = (Kunde) iS.next();
            System.out.println("Kunde: " + aKunde.getVorname() +" "+ aKunde.getName() +" ("+ aKunde.getKundennummer() + ")");
        }


        List<Kunde> KundenVektor = new Vector<>(KundenSet);
        KundenVektor.sort(Kunde.compareName);

        //Vektor Ausgabe
        System.out.println("Vektor");
        Iterator<Kunde> iV = KundenVektor.iterator();
        while(iV.hasNext()){
            Kunde aKunde = (Kunde) iV.next();
            System.out.println("Kunde: " + aKunde.getVorname() +" "+ aKunde.getName() +" ("+ aKunde.getKundennummer() + ")");
        }

        //equals-Methode
        System.out.println(K1.equals(new Object()));
        System.out.println(K1.equals(null));
        System.out.println(K1.equals(K2));
        System.out.println(K1.equals(K11));
    }
}
