package studentarea.excersises.chapter9;

import java.util.Comparator;
import java.util.Locale;

public class KundenNachNamenSortieren implements Comparator<Kunde> {

  @Override
  public int compare(Kunde o1, Kunde o2) {
    if (!o1.getName().equalsIgnoreCase(o2.getName())) {
      return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
    }
    return 0;
  }
}
