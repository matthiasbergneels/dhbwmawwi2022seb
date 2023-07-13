package studentarea.excersises.chapter12;

public class TestAlgorithms {
  public static void main(String[] args) {
    Integer[] unsortetData = {44,1,56,102,33,2,3,99,678,7};
    Long start;
    Long stop;
    Long averageDifferencePc10k = Long.valueOf(0);

    for (int i = 0; i < 10000; i++) {
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

      averageDifferencePc10k = averageDifferencePc10k + normalBubbleSortTime / optimizedBubbleSortTime * 100;



    }

    averageDifferencePc10k = averageDifferencePc10k / 10000;

    System.out.println("Difference between normal and optimized Bubble Sort : " + averageDifferencePc10k + " %");

    /*
    for (int i: sortetData
         ) {
      System.out.println(i);

    }

     */


  }
}
