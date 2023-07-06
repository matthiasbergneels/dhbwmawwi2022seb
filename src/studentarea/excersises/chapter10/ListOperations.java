package studentarea.excersises.chapter10;

import java.util.Iterator;
import java.util.TreeSet;

public class ListOperations {

  private TreeSet<Einwohner> list = new TreeSet<>();

  private Einwohner determineObject(String name, String firstName) {
    for (Einwohner inhabitant : list) {
      if (inhabitant.getName().equalsIgnoreCase(name) && inhabitant.getVorName().equalsIgnoreCase(firstName)) {
        return inhabitant;
      }
    }
    return null;
  }

  public boolean add(String anrede, String name, String firstName, String birthName, String eMail, String familySituation){
    Einwohner inhabitant = new Einwohner(name, firstName, birthName,eMail, anrede, familySituation);
    System.out.println(inhabitant);
    int temp = list.size();
    list.add(inhabitant);
    if(temp == list.size()){
      return false;
    }
    return true;
  }

  public boolean show(String name, String firstName){
    Einwohner foundInhabitant = determineObject(name, firstName);
    if(foundInhabitant != null){
      System.out.println("Einwohner: " + foundInhabitant.getAnrede()
        + " " + foundInhabitant.getVorName()
        + " " +foundInhabitant.getName()
        + "\nGeburtsname: " + foundInhabitant.getGebName()
        + "\nE-Mail: " + foundInhabitant.geteMail()
        + "\nFamilienstand: " + foundInhabitant.getFamilienStand()
      );
      return true;
    }
    return false;
  }


  public boolean search(String name, String firstName){
    if(determineObject(name, firstName) != null){
      return true;
    }
    return false;
  }

  public boolean delete(String name, String firstName){
    Einwohner inhabitantToDelete = determineObject(name, firstName);
    if(inhabitantToDelete != null){
      list.remove(inhabitantToDelete);
      return true;
    }
    return false;
  }

  public void showList(){
    for(Einwohner currentInhabitant : list){
      System.out.printf("==================================\n");
      System.out.println("Einwohner: " + currentInhabitant.getAnrede()
        + " " + currentInhabitant.getVorName()
        + " " +currentInhabitant.getName()
        + "\nGeburtsname: " + currentInhabitant.getGebName()
        + "\nE-Mail: " + currentInhabitant.geteMail()
        + "\nFamilienstand: " + currentInhabitant.getFamilienStand()
      );
    }
  }

}
