package studentarea.excersises.chapter9;

public class TestVergleichKunde {
  public static void main(String[] args) {
    Kunde firstCustomer = new Kunde("Elias", "Curry", 30);
    Kunde secondCustomer = new Kunde("Elias", "Curry", 30);
    Kunde thirdCustomer = new Kunde("Elias", "Curry", 31);

    System.out.println(firstCustomer.equals(secondCustomer));
    System.out.println(firstCustomer.equals(thirdCustomer));

  }
}
