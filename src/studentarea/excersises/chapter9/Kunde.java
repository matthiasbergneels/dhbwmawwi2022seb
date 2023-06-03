package studentarea.excersises.chapter9;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {

    private String lastName;
    private String firstName;
    private int customerNumber;
    public Kunde(String firstName, String lastName, int customerNumber) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.customerNumber = customerNumber;
    }
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public String getFirstName( ) { return this.firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public int getCustomerNumber( ) { return this.customerNumber; }
    public void setCustomerNumber(int CustomerNumber){ this.customerNumber = CustomerNumber; }
    @Override
    public int compareTo(Kunde other){
      if(other.customerNumber != this.customerNumber) {
        return this.customerNumber - other.customerNumber;
      }

      return 0;
    }
  @Override
  public String toString() {
    return firstName + " " + lastName + " with customerNumber: " + customerNumber;
  }

  public static class NameComparator implements Comparator<Kunde> {

    @Override
    public int compare(Kunde left, Kunde right) {
      if(left.lastName.toLowerCase() != right.lastName.toLowerCase()){
        return left.lastName.compareToIgnoreCase(right.lastName);
      }
      if(left.firstName.toLowerCase() != right.firstName.toLowerCase()) {
        return left.firstName.compareToIgnoreCase(right.firstName);
      }
      return 0;
    }

  }

  @Override
  public boolean equals(Object other) {
      if(other == this){ return true; }
      if(other == null){ return false; }
      if(this.getClass() != other.getClass()){ return false; }

      if(this.firstName != ((Kunde)other ).firstName) {
      return false;
     }
     if(this.lastName != ((Kunde)other ).lastName) {
       return false;
      }
      if(this.customerNumber != ((Kunde)other ).customerNumber) {
        return false;
      }
      return true;
  }
}
