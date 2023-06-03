package studentarea.excersises.chapter9;

import java.util.*;

public class TestKunde {
  public static void main(String[] args) {
    Kunde klaus = new Kunde("Mustermann", "Klaus", 4771);
    Kunde hans = new Kunde("Beispiel", "Hans", 5180);
    Kunde hilde = new Kunde("Mustermann", "Hilde", 4712);
    Kunde theodor = new Kunde("Vorbild", "Theodor", 8278);
    Kunde jimmy = new Kunde("Dummy", "Jimmy", 1111);

    Set<Kunde> kunden = new TreeSet<>();

    kunden.add(klaus);
    kunden.add(hans);
    kunden.add(hilde);
    kunden.add(theodor);
    kunden.add(jimmy);

    System.out.println("Tree-Set Ausgabe:");
    Iterator<Kunde> kundenIterator = kunden.iterator();

    while(kundenIterator.hasNext()){
      System.out.println(kundenIterator.next());
    }


    Vector<Kunde> kundenVector = new Vector<>(kunden);
    kundenVector.sort(Kunde.sortByName);

    System.out.println("\nVector Ausgabe:");
    Iterator<Kunde> kundenVectorIterator = kundenVector.iterator();
    while(kundenVectorIterator.hasNext()){
      System.out.println(kundenVectorIterator.next());
    }
  }
}
