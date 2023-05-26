package lecture.chapter9;

import lecture.chapter5.Car;
import lecture.chapter5.Student;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();

        nameList.add("Klaus");      // Index 0
        nameList.add("Nina");       // Index 1
        nameList.add("Gabi");       // Index 2
        nameList.add("Emir");       // Index 3
        nameList.set(2, "Franz");   // neuer Index 2 --> Inhalt wird überschrieben
        //nameList.add(new Student(1233));
        //nameList.add(new ArrayList());
        nameList.add("Nina");       // Index 4
        nameList.add(0, "Adam");    // neuer Index 0 -> alle anderen werden eins geschoben

        System.out.println(nameList.get(0));
        System.out.println(nameList.get(2));
        System.out.println(nameList.get(3));

        nameList.remove(2);
        nameList.remove("Nina");

        System.out.println("For-Schleife:");
        for(int i = 0; i < nameList.size(); i++){
            System.out.println(i + ": " + nameList.get(i));
        }

        System.out.println("For-Each-Schleife:");
        for(String currentName : nameList){
            /*
            if(currentName.equals("Adam")){
                nameList.add("Eva");        --> ConcurrentModificationException
            }
             */
            /*
            if(currentName.equals("Adam")){
                nameList.remove("Adam");    --> ConcurrentModificationException
            }
             */
            System.out.println(currentName);
        }

        System.out.println("Iterator:");
        Iterator<String> nameListIterator = nameList.iterator();
        while(nameListIterator.hasNext()){
            String currentName = nameListIterator.next();
            if(currentName.equals("Adam")){
                nameListIterator.remove();
                //nameList.remove("Adam"); --> ConcurrentModificationException
            }
            System.out.println(currentName);
        }

        System.out.println("Listengröße: " + nameList.size());
    }
}
