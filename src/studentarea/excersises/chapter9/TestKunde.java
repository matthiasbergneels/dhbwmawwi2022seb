package studentarea.excersises.chapter9;

import lecture.chapter9.Person;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class TestKunde {

  public static void main(String[] args) {
    //Erzeugen der Kunden
    Kunde kunde1 = new Kunde("Mustermann", "Klaus", 4711);
    Kunde kunde2 = new Kunde("Beispiel", "Hans", 5180);
    Kunde kunde3 = new Kunde("Mustermann", "Hilde", 4712);
    Kunde kunde4 = new Kunde("Vorbild", "Theodor", 8278);
    Kunde kunde5 = new Kunde("Dummy", "Jimmy", 1111);

    //Ablegen in Datencontainer Klasse TreeSet

    TreeSet<Kunde> kunden = new TreeSet<Kunde>();

    kunden.add(kunde1);
    kunden.add(kunde2);
    kunden.add(kunde3);
    kunden.add(kunde4);
    kunden.add(kunde5);

    Iterator<Kunde> kundenIterator = kunden.iterator();

    while (kundenIterator.hasNext()) {
      System.out.println(kundenIterator.next().getKundennummer());

    }

    //Ablegen in Vector und Sortieren
    Vector<Kunde> kundenVector = new Vector<Kunde>(kunden);

    kundenVector.sort(Kunde.sortByNames);

    for(Kunde currentKunde : kundenVector){
      System.out.println(currentKunde.name + ", " + currentKunde.vorname);
    }



  }


    }


