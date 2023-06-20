package studentarea.lecture.chapter9;

import java.util.Objects;

public class Person {
  private String name;
  private String familyName;
  private int age;

  public Person(String name, String familyName, int age) {
    this.name = name;
    this.familyName = familyName;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name) && Objects.equals(familyName, person.familyName);
  }
  public int hashCode() {
    return age + this.name.hashCode() + this.familyName.hashCode();
  }
}
