package studentarea.excersises.chapter9.exercise2;

import java.util.Comparator;

public class Customer {

  private String name;
  private String firstName;
  private int customerNo;

  public static Comparator<Customer> sortByNameAndFirstNameComparator = (customer, other) -> {
    if (!customer.name.equalsIgnoreCase(other.name)) {
      return customer.name.compareToIgnoreCase(other.name);
    }
    if (!customer.firstName.equalsIgnoreCase(other.name)) {
      return customer.firstName.compareToIgnoreCase(other.firstName);
    }

    return 0;
  };

  public Customer(String name, String firstName, int customerNo) {
    this.name = name;
    this.firstName = firstName;
    this.customerNo = customerNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getCustomerNo() {
    return customerNo;
  }

  public void setCustomerNo(int customerNo) {
    this.customerNo = customerNo;
  }

  @Override
  public String toString() {
    return "Customer{" +
      "name='" + name + '\'' +
      ", firstName='" + firstName + '\'' +
      ", customerNo=" + customerNo +
      '}';
  }
}
