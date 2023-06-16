package lecture.chapter9;

public class ComparingObjects {

  public static void main(String[] args) {

    String text1 = "Hallo";
    String text2 = "Hallo";
    String text3 = new String("Hallo");

    Person person1 = new Person("Gabi", "Mueller", 32);
    Person person2 = new Person("Nina", "Rexi", 39);
    Person person3 = person1;
    Person person4 = new Person("Nina", "Rexi", 39);
    Person person5 = new Person("Rexi", "Nina", 39);

    System.out.println("== - Vergleich:");
    System.out.println(text1 + " == " + text2 + ": " + (text1 == text2));
    System.out.println(text1 + " == " + text3 + ": " + (text1 == text3));

    System.out.println("person1 == person2: " + (person1 == person2));
    System.out.println("person1 == person3: " + (person1 == person3));
    System.out.println("person2 == person4: " + (person2 == person4));
    System.out.println("person4 == person5: " + (person4 == person5));

    System.out.println("HashCodes:");
    System.out.println("person1: " + person1.hashCode());
    System.out.println("person2: " + person2.hashCode());
    System.out.println("person3: " + person3.hashCode());
    System.out.println("person4: " + person4.hashCode());
    System.out.println("person5: " + person5.hashCode());



    System.out.println("equals - Vergleich:");
    System.out.println(text1 + " equals " + text2 + ": " + text1.equals(text2));
    System.out.println(text1 + " equals " + text3 + ": " + text1.equals(text3));

    System.out.println("person1 equals person2: " + (person1.equals(person2)));
    System.out.println("person1 equals person3: " + (person1.equals(person3)));
    System.out.println("person2 equals person4: " + (person2.equals(person4)));
    System.out.println("person4 equals person5: " + (person4.equals(person5)));

  }
}
