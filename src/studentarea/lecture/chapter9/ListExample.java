package studentarea.lecture.chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List Liste = new ArrayList(); //Interface benutzen best practice // Generics, nicht typisiert -> zur Laufzeit object
        List<String> TypListe = new ArrayList<>(); //Typisiert //hintere <> kann auch <String> sein
        Iterator<String> ListIterator = TypListe.iterator();

        TypListe.add("Hans");
        TypListe.add("Peter");
        TypListe.add("Jürgen");

        //TypListe.set(1,"Hans2");

        for (String name: TypListe) {
            System.out.println(name);
        }

        System.out.println(TypListe.contains("Hans"));
    }
}
