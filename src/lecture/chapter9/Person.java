package lecture.chapter9;

import java.util.Comparator;

public class Person implements Comparable<Person> {
  public static Comparator<Person> sortByFamilyName = (Person p1, Person p2) -> {
    return p1.familyName.toLowerCase().compareTo(p2.familyName.toLowerCase());
  };
  public static Comparator<Person> sortByName = (p1, p2) -> {
    return p1.name.toLowerCase().compareTo(p2.name.toLowerCase());
  };
  public static Comparator<Person> sortByAge = (Person p1, Person p2) -> {
    return p1.age - p2.age;
  };
  private String name;
  private String familyName;
  private int age;

  public Person(String name, String familyName, int age) {
    this.name = name;
    this.familyName = familyName;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", familyName='" + familyName + '\'' +
      ", age=" + age +
      '}';
  }

  @Override
  public int compareTo(Person o) {
    if (!this.familyName.equalsIgnoreCase(o.getFamilyName())) {
      return this.familyName.toLowerCase().compareTo(o.getFamilyName().toLowerCase());
    }

    if (!this.name.equalsIgnoreCase(o.getName())) {
      return this.name.toLowerCase().compareTo(o.getName().toLowerCase());
    }

    if (this.age != o.getAge()) {
      return this.age - o.getAge();
    }

    return 0;
  }

  public boolean equals(Object o) {
    return false;
  }

  public static class SortByName implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
      return p1.name.toLowerCase().compareTo(p2.name.toLowerCase());
    }
  }
}
