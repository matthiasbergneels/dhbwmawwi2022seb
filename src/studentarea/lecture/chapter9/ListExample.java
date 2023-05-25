package studentarea.lecture.chapter9;

import lecture.chapter5.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {


    public static void main(String[] args) {


        //ArrayList without Tag hat Object als Tag
        ArrayList<String> nameList = new ArrayList<>();

        //Einfaches adden von namen
        //Namen werden hintereinander geaddet
        nameList.add("Adam");
        nameList.add("Klaus");
        nameList.add("Nina");
        nameList.add("Gabi");
        nameList.add("Emir");

        //Werte werden an einer Position geaddet
        nameList.set(2, "Franz");
        //nameList.add(new Student(1234));
        //nameList.add(new ArrayList());
        nameList.add("Nina");

        System.out.println(nameList.get(0));
        System.out.println(nameList.get(2));
        System.out.println(nameList.get(3));

        nameList.remove(2);
        //Immer erstes Object mit dem Namen "Nina" gelöscht
        nameList.remove("Nina");


        System.out.println("\nFor-Schleife");
        for(int i = 0; i < nameList.size(); i++)
        {
            System.out.println(i + ": " +nameList.get(i));
        }

        //Kann bei ForEach und While nicht modifiziert werden während der Ausführung des Programmmes
        System.out.println("\nFor-Each-Schleife");
        for (String currentName : nameList)
        {
            /* --> ConcurrentModificationException
            if(currentName.equals("Adam"))
            {
                nameList.add("Eva");
            }*/
            /* i --> ConcurrentModificationException
            if(currentName.equals("Adam"))
            {
                nameList.remove("Adam");
            }*/
            System.out.println(currentName);
        }

        System.out.println("\nIterator: ");
        Iterator<String> nameListIterator = nameList.iterator();
        while (nameListIterator.hasNext())
        {
            String currentName = nameListIterator.next();
            if(currentName.equals("Adam"))
            {
                nameListIterator.remove();
                //nameList.remove("Adam"); --> ConcurrentModificationException
            }
            System.out.println(currentName);
        }

        System.out.println("Listengröße: " + nameList.size());








    }

}
