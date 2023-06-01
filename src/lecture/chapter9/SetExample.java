package lecture.chapter9;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> nameSet = new HashSet<>();

        nameSet.add("Klaus");
        nameSet.add("Gabi");
        nameSet.add("Nina");
        nameSet.add("Adam");
        nameSet.add("Zeus");

        System.out.println("Größe der Menge: " + nameSet.size());
        System.out.println("Doppelte Gabi : " + nameSet.add("Gabi"));
        System.out.println("Größe der Menge: " + nameSet.size());
        nameSet.remove("Gabi");
        System.out.println("Größe der Menge: " + nameSet.size());

        System.out.println("For-Each:");
        for(String currentName : nameSet){
            if(currentName.equals("Adam")){
                //nameSet.remove("Adam"); --> ConcurrentModificationException
            }
            System.out.println(currentName);
        }

        System.out.println("Iterator:");
        Iterator<String> nameSetIterator = nameSet.iterator();
        while(nameSetIterator.hasNext()){
            String currentName = nameSetIterator.next();
            if(currentName.equals("Adam")){
                nameSetIterator.remove();
                //nameSet.remove("Adam"); --> ConcurrentModificationException
            }
            System.out.println(currentName + " - " + currentName.hashCode());
        }

        System.out.println("Größe der Menge: " + nameSet.size());




        // Persons

        Set<Person> personSet = new TreeSet<>();

        Person myPerson = new Person("Katrin", "Gorilla", 33);

        personSet.add(new Person("Klaus", "Zeus", 35));
        personSet.add(new Person("Gabi", "Mueller", 33));
        personSet.add(new Person("Nina", "Rexi", 39));
        personSet.add(myPerson);
        personSet.add(new Person("Michael", "Mayer", 22));
        personSet.add(myPerson);

        for(Person currentPerson : personSet){
            System.out.println(currentPerson);
        }
    }
}
