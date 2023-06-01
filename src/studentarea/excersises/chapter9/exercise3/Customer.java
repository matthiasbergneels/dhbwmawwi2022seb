package studentarea.excersises.chapter9.exercise3;

import java.util.Objects;

public class Customer implements Comparable<Customer> {

  private String name;
  private String firstName;
  private int customerNo;

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
  public int compareTo(Customer o) {
    if (!this.name.equalsIgnoreCase(o.name)) {
      return this.name.compareToIgnoreCase(o.name);
    }
    if (!this.firstName.equalsIgnoreCase(o.name)) {
      return this.firstName.compareToIgnoreCase(o.firstName);
    }

    return 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;

    Customer customer = (Customer) o;

    if (this.customerNo != customer.customerNo) return false;
    if (!Objects.equals(this.name, customer.name)) return false;
    if (!Objects.equals(this.firstName, customer.firstName)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.customerNo, this.name, this.firstName);
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
