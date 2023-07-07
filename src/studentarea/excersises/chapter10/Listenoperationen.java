package lecture.chapter10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Listenoperationen {
  private Set<Einwohner> liste = new TreeSet<>();



  private Einwohner ermitteleObjekt(String name, String vorname){
    Iterator<Einwohner> listIterator = liste.iterator();

    while(listIterator.hasNext()){
      Einwohner curEinwohner = listIterator.next();
      if(curEinwohner.getName().equals(name) && curEinwohner.getVorname().equals(vorname)) return curEinwohner;
   }
    return null;
  }

  public boolean hinzufuegen(String anrede, String name, String vorname, String gebName, String eMail, String familienstand){
    Einwohner newEinwohner = new Einwohner(name, vorname, gebName, eMail, anrede, familienstand);
    System.out.println(newEinwohner);
    return liste.add(newEinwohner);
  }

  public boolean anzeigen(String name, String vorname){
    Einwohner ermttelterEinwohner = ermitteleObjekt(name, vorname);
    if(ermttelterEinwohner == null){
      return false;
    }
    System.out.println(ermttelterEinwohner);
    return true;
  }

  public boolean suchen(String name, String vorname ){
    if(ermitteleObjekt(name, vorname) != null) return true;
    return false;
  }

  public boolean loeschen(String name, String vorname ){
    Einwohner zuLöschendeEinwohner = ermitteleObjekt(name, vorname);
    if(zuLöschendeEinwohner == null){
      return false;
    }
    return liste.remove(ermitteleObjekt(name, vorname));
  }

  public void listAusgeben(){
    Iterator<Einwohner> einwohnerIterator = liste.iterator();
    while (einwohnerIterator.hasNext()){
      System.out.println(einwohnerIterator.next());
    }
  }



}
