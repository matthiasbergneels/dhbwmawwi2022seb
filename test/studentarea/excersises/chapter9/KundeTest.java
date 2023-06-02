package studentarea.excersises.chapter9;


import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class KundeTest {

  @Test
  public void CustomerOrderTest() {
    Kunde kunde1 = new Kunde("Mustermann", "Klaus ", 4711);
    Kunde kunde2 = new Kunde("Beispiel", "Hans ", 5180);
    Kunde kunde15 = new Kunde("Beispiel", "Hans ", 518);
    Kunde kunde3 = new Kunde("Mustermann", "Hilde ", 4712);
    Kunde kunde4 = new Kunde("Vorbild", "Theodor ", 8278);
    Kunde kunde5 = new Kunde("Dummy", "Jimmy ", 1111);


    Set<Kunde> kundenListe = new TreeSet<>();


    kundenListe.add(kunde1);
    kundenListe.add(kunde2);
    kundenListe.add(kunde3);
    kundenListe.add(kunde4);
    kundenListe.add(kunde5);

    Vector<Kunde> kundenVector = new Vector<>(kundenListe);


    Iterator<Kunde> it = kundenListe.iterator();


    kundenVector.sort(Kunde.sortByFamilyname);
    Iterator<Kunde> iteratorVector = kundenVector.iterator();

    int kundenChecker = 0;
    int actualNumber;

    while (iteratorVector.hasNext()) {
      var nextKunde = iteratorVector.next();
      System.out.println("Nachname:" + nextKunde.getName() + " " + "Vorname:" + nextKunde.getVorname());
    }

    if (kunde2.equals(kunde15)) {
      System.out.println("Kunden sind gleich");
    } else {
      System.out.println("Kunden sind nicht gleich");
    }


    while (it.hasNext()) {
      actualNumber = it.next().getKundenNummer();

      //assert (kundenChecker <= actualNumber);
      kundenChecker = actualNumber;

      System.out.println(actualNumber);
    }


  }


}