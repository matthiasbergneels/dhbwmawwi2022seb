package studentarea.excersises.chapter12;

public class TestInsertionSort {

  public static void main(String[] args) {
    Integer[] unsortetData = {44,1,56,102,33,2,3,99,678,7};

    Integer[] sortedData = Algorithmen.insertionSort(unsortetData);

    for (int i: sortedData
    ) {
      System.out.println(i);

    }
  }
}
