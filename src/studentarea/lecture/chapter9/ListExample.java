package studentarea.lecture.chapter9;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Zebra");
        animals.add("Giraf");
        animals.add("Hippo");
        animals.add(1, "Lion");
        animals.add("Pigunins");

        Iterator aniterator = animals.iterator();

        while (aniterator.hasNext()) {
            System.out.println(aniterator.next());
            aniterator.remove();


        }
        System.out.println("Alle nach Madagascar ^^");
        System.out.println(animals.size());

    }


}
