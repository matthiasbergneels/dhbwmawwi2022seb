package studentarea.excersises.chapter12;

public class TestAlgorithms {
  public static void main(String[] args) {
    Integer[] unsortetData = {44,1,56,102,33,2,3,99,678,7};
    Long start;
    Long stop;


    System.out.println("Normal Bubble Sort");
    start = System.nanoTime();
    Algorithmen.optBubbleSort(unsortetData);
    stop = System.nanoTime();

    Long normalBubbleSortTime = stop - start;
    System.out.println("Normal Bubble Sort: " + normalBubbleSortTime + " ns");

    System.out.println("Optimized Bubble Sort");
    start = System.nanoTime();
    Algorithmen.optBubbleSort(unsortetData);
    stop = System.nanoTime();

    Long optimizedBubbleSortTime = stop - start;

    System.out.println("Optimized Bubble Sort: " + optimizedBubbleSortTime + " ns");

    Long diffrencePC = normalBubbleSortTime / optimizedBubbleSortTime * 100;

    System.out.println("Difference between normal and optimized Bubble Sort : " + diffrencePC + " %");


    /*
    for (int i: sortetData
         ) {
      System.out.println(i);

    }

     */


  }
}
