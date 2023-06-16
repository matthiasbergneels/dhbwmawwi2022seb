package studentarea.lecture.chapter9;

import java.util.Comparator;

public class SortPersonByNameCharacterCount implements Comparator<Person> {

  @Override
  public int compare(Person p1, Person p2) {
    return (p1.getName().length() + p1.getFamilyName().length()) - (p2.getName().length() + p2.getFamilyName().length());
  }
}
