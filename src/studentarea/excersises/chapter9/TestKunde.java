package studentarea.excersises.chapter9;
import java.util.*;
public class TestKunde {
  public static void main(String[] args) {
    Set<Kunde> set = new TreeSet<Kunde>();
    set.add(new Kunde("Klaus", "Mustermann", 4711));
    set.add(new Kunde("Hans", "Beispiel", 5180));
    set.add(new Kunde("Hilde", "Mustermann", 4712));
    set.add(new Kunde("Theodor", "Vorbild", 8278));
    set.add(new Kunde("Jimmy", "Dummy", 1111));

    for(Kunde k : set) {
      System.out.println(k);
    }
    System.out.println("\n\n\n\n");
    List<Kunde> list = new Vector<Kunde>(set);

    list.sort(new Kunde.NameComparator());

    for(var x : list) {
      System.out.println(x);
    }


  }
}
