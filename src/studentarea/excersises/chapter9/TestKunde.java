package studentarea.excersises.chapter9;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Iterator;

public class TestKunde {
    public static void main(String[] args) {
        Kunde k1 = new Kunde("Mustermann", "Klaus", 4711);
        Kunde k2 = new Kunde("Beispiel", "Hans", 5180);
        Kunde k3 = new Kunde("Mustermann", "Hilde", 4712);
        Kunde k4 = new Kunde("Vorbild", "Theodor", 8278);
        Kunde k5 = new Kunde("Dummy", "Jimmy", 1111);

        System.out.println("TreeSet:");
        SortedSet<Kunde> set = new TreeSet<>(List.of(k1, k2, k3, k4, k5));
        Iterator<Kunde> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        System.out.println("Vector:");
        List<Kunde> vector = new Vector<>(List.of(k1, k2, k3, k4, k5));
        vector.sort(Kunde.sortByName);
        Iterator<Kunde> vectorIterator = vector.iterator();
        while (vectorIterator.hasNext()) {
            System.out.println(vectorIterator.next());
        }
    }
}
