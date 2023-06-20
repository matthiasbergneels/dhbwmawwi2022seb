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
    // Alias Check
    if (this == o) {
      return true;
    }

    // Null Check
    if (o == null) {
      return false;
    }

    // Type Check
    if (this.getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;

    // Attribute checks
    if (!this.name.equals(person.name)) {
      return false;
    }

    if (!this.familyName.equals(person.familyName)) {
      return false;
    }

    return this.age == person.age;

    /*
    // Attribute Check

    return this.compareTo(person) == 0;
    */
  }

  public int hashCode() {
    int hc = 17;

    hc = hc ^ 59 * age;
    hc = hc ^ 97 * ((this.name == null) ? 0 : this.name.hashCode());
    hc = hc ^ 56 * ((this.familyName == null) ? 0 : this.familyName.hashCode());

    return hc;
  }

  public static class SortByName implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
      return p1.name.toLowerCase().compareTo(p2.name.toLowerCase());
    }
  }


  /*
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (age != person.age) return false;
    if (!Objects.equals(name, person.name)) return false;
    return Objects.equals(familyName, person.familyName);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
    result = 31 * result + age;
    return result;
  }

   */
}
