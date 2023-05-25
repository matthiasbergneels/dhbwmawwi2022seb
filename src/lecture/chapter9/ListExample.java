package lecture.chapter9;

import lecture.chapter5.Car;
import lecture.chapter5.Student;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();

        nameList.add("Klaus");      // 0
        nameList.add("Nina");       // 1
        nameList.add("Gabi");       // 2
        nameList.add("Emir");       // 3
        nameList.set(2, "Franz");   // 2
        //nameList.add(new Student(1233));
        //nameList.add(new ArrayList());
        nameList.add("Nina");
        nameList.add(0, "Adam");

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
            /* --> ConcurrentModificationException
            if(currentName.equals("Adam")){
                nameList.add("Eva");
            }
             */
            /* --> ConcurrentModificationException
            if(currentName.equals("Adam")){
                nameList.remove("Adam");
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
