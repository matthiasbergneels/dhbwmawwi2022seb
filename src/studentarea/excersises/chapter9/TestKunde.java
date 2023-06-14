package studentarea.excersises.chapter9;


import java.util.Iterator;
import java.util.TreeSet;

public class TestKunde {
  public static void main(String[] args) {
    Kunde kunde1 = new Kunde("Klaus", "Mustermann", 4711);
    Kunde kunde2 = new Kunde("Hans", "Beispiel", 5180);
    Kunde kunde3 = new Kunde("Hilde", "Mustermann", 4712);
    Kunde kunde4 = new Kunde("Dummy", "Vorbild", 8278);
    Kunde kunde5 = new Kunde("Jimmy", "Theodor", 1111);

    TreeSet<Kunde> kundenSet = new TreeSet<>();
    kundenSet.add(kunde1);
    kundenSet.add(kunde2);
    kundenSet.add(kunde3);
    kundenSet.add(kunde4);
    kundenSet.add(kunde5);

    Iterator i = kundenSet.iterator();
    while(i.hasNext()){
      Kunde k = (Kunde) i.next();
      System.out.println(k.getKundenNummer() + ": " +k.getVorname() + " " + k.getName());
    }


  }
}
