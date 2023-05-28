package studentarea.excersises.chapter9;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class TestKunde {
    public static void main(String[] args) {
        List<Kunde> kunden = List.of(
                new Kunde("Mustermann", "Klaus", 4711),
                new Kunde("Beispiel", "Hans", 5180),
                new Kunde("Mustermann", "Hilde", 4712),
                new Kunde("Vorbild", "Theodor", 8278),
                new Kunde("Dummy", "Jimmy", 1111)
        );

        TreeSet<Kunde> kundenSet = new TreeSet<>(kunden);

        Iterator<Kunde> iterator = kundenSet.iterator();
        iterator.forEachRemaining(System.out::println);


        System.out.println("Übung 2");
        //Übung 2
        Vector<Kunde> kundenVector = new Vector<>(kunden);
        kundenVector.sort((kunde1, kunde2) -> {
            int compareName = kunde1.getName().compareTo(kunde2.getName());
            int compareVorname = kunde1.getVorname().compareTo(kunde2.getVorname());
            return compareName == 0 ? compareVorname : compareName;
        });
        kundenVector.iterator().forEachRemaining(System.out::println);

    }
}
