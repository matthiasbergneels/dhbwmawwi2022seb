package studentarea.lecture.chapter9;

public class ComapringObjects {
  public static void main(String[] args) {
    Person person1 = new Person("Michael", "Jordan", 23);
    Person person2 = new Person("Jordan", "Michael", 23);

    System.out.println("Hashcodes:");

    System.out.println("person1: " + person1.hashCode());
    System.out.println("person2: " + person2.hashCode());

  }
}
