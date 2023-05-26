package studentarea.lecture.chapter9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> MySet = new TreeSet<>(); //Sortierung nach ASCII

        MySet.add("Hans");
        MySet.add("Peter");
        MySet.add("Jürgen");

        System.out.println(MySet.add("Peter"));

        Iterator<String> myIterator = MySet.iterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

    }
}
