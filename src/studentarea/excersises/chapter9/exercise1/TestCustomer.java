package studentarea.excersises.chapter9.exercise1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestCustomer {

  public static void main(String[] args) {

    Customer c1 = new Customer("Mustermann", "Klaus", 4711);
    Customer c2 = new Customer("Beispiel", "Hans", 5180);
    Customer c3 = new Customer("Mustermann", "Hilde", 4712);
    Customer c4 = new Customer("Vorbild", "Theodor", 8278);
    Customer c5 = new Customer("Dummy", "Jimmy", 1111);

    Set<Customer> customerTreeSet = new TreeSet<>();
    customerTreeSet.add(c1);
    customerTreeSet.add(c2);
    customerTreeSet.add(c3);
    customerTreeSet.add(c4);
    customerTreeSet.add(c5);

    Iterator<Customer> iterator = customerTreeSet.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
}
