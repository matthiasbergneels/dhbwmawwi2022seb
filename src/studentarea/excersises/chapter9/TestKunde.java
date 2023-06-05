package studentarea.excersises.chapter9;
import java.util.*;


public class TestKunde {
    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Musteramann", "Klaus", 4711);
        Kunde kunde2 = new Kunde("Beispiel", "Hans", 5180);
        Kunde kunde3 = new Kunde("Musteramann", "Hilde", 4712);
        Kunde kunde4 = new Kunde("Vorbild", "Theodor", 8278);
        Kunde kunde5 = new Kunde("Dummy", "Jimmy", 1111);


        Set<Kunde> kundenMenge = new TreeSet<>();
        kundenMenge.add(kunde1);
        kundenMenge.add(kunde2);
        kundenMenge.add(kunde3);
        kundenMenge.add(kunde4);
        kundenMenge.add(kunde5);

        Iterator i = kundenMenge.iterator();

      System.out.println(kundenMenge.size());

      System.out.println("Kunden nach der Kundennummer sortiert: \n");
      while(i.hasNext()){
        System.out.println(i.next());
      }


      System.out.println("\n==============================================================");

      List<Kunde> kundenListe = new ArrayList<Kunde>(kundenMenge);

      kundenListe.sort(new KundenNachNamenSortieren());

      System.out.println("Kunden nach dem Nachnamen sortiert: \n");

      for (Kunde kunde: kundenListe) {
        System.out.println(kunde);
      }
    }


}
