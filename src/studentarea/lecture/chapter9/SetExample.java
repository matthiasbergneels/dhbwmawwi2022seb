package studentarea.lecture.chapter9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        //TreeSet wird nach ASCII Sortiert
        //HashSet wird nach anderer Ordnung Sortiert
        Set<String> nameSet = new HashSet<>();

        nameSet.add("Klaus");
        nameSet.add("Gabi");
        nameSet.add("Nina");
        nameSet.add("Adam");
        nameSet.add("Zeus");

        System.out.println("Große der Menge : " + nameSet.size());

        System.out.println("Doppelte Gabi : " + nameSet.add("Gabi"));

        System.out.println("Größe der Menge : " + nameSet.size());

        nameSet.remove("Gabi");

        System.out.println("Größe der Menge : " + nameSet.size());

        for (String currentName : nameSet)
        {
            if(currentName.equals("Adam"))
            {
                //nameSet.remove("Adam"); --> ConcurrentModificationException
            }

            System.out.println(currentName);
        }

        Iterator<String> nameSetIterator = nameSet.iterator();

        while (nameSetIterator.hasNext())
        {
            String currentName = nameSetIterator.next();

            if(currentName.equals("Adam"))
            {
                nameSetIterator.remove();
                //nameSet.remove("Adam") --> ConcurrentModificationException
            }

            System.out.println(currentName + " - " + currentName.hashCode());
        }


        //Sortierung nach ASCII Tabelle
        System.out.println("Größe der Menge : " + nameSet.size());
        //Persons

        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("Klaus", "Zeus", 35));
        personSet.add(new Person("Gabi", "Müller", 31));
        personSet.add(new Person("Nina", "Rexi", 39));

        for (Person currentPerson : personSet)
        {
            System.out.println(currentPerson);
        }
    }

}
