package studentarea.lecture.chapter9;

import lecture.chapter9.Person;

public class ComparingObjects {

  public static void main(String[] args) {

    String text1 = "Hallo";
    String text2 = "Hallo";
    String text3 = new String("Hallo");

    lecture.chapter9.Person person1 = new lecture.chapter9.Person("Gabi", "Mueller", 32);
    lecture.chapter9.Person person2 = new lecture.chapter9.Person("Nina", "Rexi", 39);
    lecture.chapter9.Person person3 = person1;
    lecture.chapter9.Person person4 = new Person("Nina", "Rexi", 39);

    System.out.println("== - Vergleich:");
    System.out.println(text1 + " == " + text2 + ": " + (text1 == text2));
    System.out.println(text1 + " == " + text3 + ": " + (text1 == text3));

    System.out.println("person1 == person2: " + (person1 == person2));
    System.out.println("person1 == person3: " + (person1 == person3));
    System.out.println("person2 == person4: " + (person2 == person4));



    System.out.println("equals - Vergleich:");
    System.out.println(text1 + " equals " + text2 + ": " + text1.equals(text2));
    System.out.println(text1 + " equals " + text3 + ": " + text1.equals(text3));

    System.out.println("person1 equals person2: " + (person1.equals(person2)));
    System.out.println("person1 equals person3: " + (person1.equals(person3)));
    System.out.println("person2 equals person4: " + (person2.equals(person4)));

  }
}
