package studentarea.excersises.chapter9.exercise2;

import java.util.*;

public class TestCustomer {

  public static void main(String[] args) {

    Customer c1 = new Customer("Mustermann", "Klaus", 4711);
    Customer c2 = new Customer("Beispiel", "Hans", 5180);
    Customer c3 = new Customer("Mustermann", "Hilde", 4712);
    Customer c4 = new Customer("Vorbild", "Theodor", 8278);
    Customer c5 = new Customer("Dummy", "Jimmy", 1111);

    Vector<Customer> customerVector = new Vector<>();
    customerVector.add(c1);
    customerVector.add(c2);
    customerVector.add(c3);
    customerVector.add(c4);
    customerVector.add(c5);

    customerVector.sort(Customer.sortByNameAndFirstNameComparator);

    Iterator<Customer> iterator = customerVector.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
}
