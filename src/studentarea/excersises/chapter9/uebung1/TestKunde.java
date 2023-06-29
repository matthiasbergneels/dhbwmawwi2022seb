package studentarea.excersises.chapter9.uebung1;

import java.util.Iterator;
import java.util.TreeSet;

public class TestKunde {


  public static void main(String[] args) {

    TreeSet<Kunde> kundenSet = new TreeSet<Kunde>();


    Kunde k1 = new Kunde("Mustermann", "Klaus", 4711);
    Kunde k2 = new Kunde("Beispiel", "Hans", 5180);
    Kunde k3 = new Kunde("Mustermann", "Hilde", 4712);
    Kunde k4 = new Kunde("Vorbild", "Theodor", 8278);
    Kunde k5 = new Kunde("Dummy", "Jimmy", 1111);

    kundenSet.add(k1);
    kundenSet.add(k2);
    kundenSet.add(k3);
    kundenSet.add(k4);
    kundenSet.add(k5);


    Iterator<Kunde> kundenSetIterator = kundenSet.iterator();


    while (kundenSetIterator.hasNext())
    {
        System.out.println(kundenSetIterator.next());
    }


  }

}
