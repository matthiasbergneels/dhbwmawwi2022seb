package studentarea.excersises.chapter9;


import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class KundeTest {

  @Test
  public void CustomerOrderTest() {
    Kunde kunde1 = new Kunde("Mustermann", "Klaus ", 4711);
    Kunde kunde2 = new Kunde("Beispiel", "Hans ", 5180);
    Kunde kunde3 = new Kunde("Mustermann", "Hilde ", 4712);
    Kunde kunde4 = new Kunde("Vorbild", "Theodor ", 8278);
    Kunde kunde5 = new Kunde("Dummy", "Jimmy ", 1111);


    Set<Kunde> kundenListe = new TreeSet<>();

    kundenListe.add(kunde1);
    kundenListe.add(kunde2);
    kundenListe.add(kunde3);
    kundenListe.add(kunde4);
    kundenListe.add(kunde5);

    Iterator<Kunde> it = kundenListe.iterator();

    int kundenChecker = 0;
    int actualNumber;


    while (it.hasNext()) {
      actualNumber = it.next().getKundenNummer();

      assert (kundenChecker <= actualNumber);
      kundenChecker = actualNumber;

      System.out.println(actualNumber);
    }

  }


}