package studentarea.lecture.chapter9;

import java.util.*;

public class Collection_Framework {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Soliaman");
        myList.add("Yousuf");
        myList.add("Said");
        myList.add("Laila");
        myList.set(0, "Amiri");
        System.out.println(myList.get(0));
        System.out.println(myList.contains("Soliaman"));
        System.out.println(myList.size());


        Iterator i = myList.iterator();
        while(i.hasNext()){
            if (i.equals("Amiri")) {
            i.remove();
            }
            System.out.println(i.next());
        }

        myList.clear();
        System.out.println(myList.size());
    }
}
