package studentarea.excersises.chapter9.exercise1;

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
    return this.customerNo - o.customerNo;
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
