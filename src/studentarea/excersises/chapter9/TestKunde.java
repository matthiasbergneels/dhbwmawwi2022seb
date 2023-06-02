package studentarea.excersises.chapter9;

import java.util.Iterator;
import java.util.TreeSet;

public class TestKunde {
  public static void main(String[] args) {
    Kunde a = new Kunde("Mustermann", "Klaus", 4711);
    Kunde b = new Kunde("Beispiel", "Hans", 5180);
    Kunde c = new Kunde("Mustermann", "Hilde", 4712);
    Kunde d = new Kunde("Vorbild", "Theodor", 8278);
    Kunde e = new Kunde("Dummy", "Jimmy", 1111);

    TreeSet<Kunde> kundenTreeSet = new TreeSet<>();
    kundenTreeSet.add(a);
    kundenTreeSet.add(b);
    kundenTreeSet.add(c);
    kundenTreeSet.add(d);
    kundenTreeSet.add(e);

    Iterator<Kunde> iterator = kundenTreeSet.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
