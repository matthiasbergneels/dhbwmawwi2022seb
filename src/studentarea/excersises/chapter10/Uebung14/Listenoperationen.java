package studentarea.excersises.chapter10.Uebung14;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Listenoperationen {

  private static Listenoperationen instance;

  private TreeSet<Einwohner> liste;

  private Listenoperationen(){
    this.liste = new TreeSet<>();
  }

  public static Listenoperationen getInstance(){
    if(Listenoperationen.instance == null)
      instance = new Listenoperationen();
    return instance;
  }

  private Einwohner ermittleObjekt(String name, String vorname) {
    var iterator = this.liste.iterator();

    while(iterator.hasNext()){
      Einwohner nextEinwohner = iterator.next();

      if(nextEinwohner.getVorname().equals(vorname) && nextEinwohner.getName().equals(name))
        return nextEinwohner;
    }

    return null;
  }

  public boolean hinzufuegen(String anrede, String name, String vorname, String gebName, String email, String familienstand) {
    return this.liste.add(new Einwohner(name, vorname, gebName, email, anrede, familienstand));
  }

  public boolean anzeigen(String name, String vorname) {
    Einwohner einwohner = this.ermittleObjekt(name, vorname);

    if(einwohner != null) {
      System.out.println(einwohner);
      return true;
    }
    return false;
  }

  public boolean suchen(String name, String vorname){
    return this.ermittleObjekt(name, vorname) != null;
  }

  public boolean loeschen(String name, String vorname) {
    Einwohner einwohner = this.ermittleObjekt(name, vorname);
    if(einwohner == null)
      return false;

    return this.liste.remove(einwohner);
  }

  public void listeAusgeben(){
    Iterator<Einwohner> iterator = this.liste.iterator();

    while(iterator.hasNext())
      System.out.println(iterator.next());
  }
}
