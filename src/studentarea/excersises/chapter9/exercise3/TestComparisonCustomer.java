package studentarea.excersises.chapter9.exercise3;


public class TestComparisonCustomer {

  public static void main(String[] args) {

    Customer c1 = new Customer("Mustermann", "Klaus", 4711);
    Customer c2 = new Customer("Mustermann", "Klaus", 4711);

    System.out.println(c1.equals(c2));

  }
}
