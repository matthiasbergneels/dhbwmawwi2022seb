package lecture.chapter13;

public class SortingAlgorithms {

  private static long swapCount = 0;

  public static void main(String[] args) {
    int[] toSort = {50, 70, 100, 80, 40, 30, 20, 10 ,60};
    System.out.println("Unsortiert: ");
    printArray(toSort);

    int[] sorted = bubbleSort(toSort.clone());
    System.out.println("Bubble Sort V1 sortiert: ");
    printArray(sorted);

    sorted = bubbleSortV2(toSort.clone());
    System.out.println("Bubble Sort V2 sortiert: ");
    printArray(sorted);

    sorted = selectionSort(toSort.clone());
    System.out.println("Selection Sort sortiert: ");
    printArray(sorted);

  }

  public static int[] bubbleSort(int[] numbers){

    swapCount = 0;
    long startTime = System.nanoTime();

    for(int i = numbers.length; i > 0; i--){
      for(int j = 0; j < numbers.length-1; j++){
        if(numbers[j] > numbers[j+1]){
          // swap
          swap(numbers, j, j+1);
        }
      }
    }

    long stopTime = System.nanoTime();

    printRuntimeDuration("BubbleSort V1", numbers.length, startTime, stopTime);

    return numbers;
  }

  public static int[] bubbleSortV2(int[] numbers){

    int j = numbers.length - 1;
    boolean swapped;

    long startTime = System.nanoTime();

    do{
      swapped = false;

      for(int i = 0; i < j; i++){
        if(numbers[i] > numbers[i+1]){
          swap(numbers, i, i+1);
          swapped = true;
        }
      }
      j--;
    }while(swapped);

    long stopTime = System.nanoTime();

    printRuntimeDuration("BubbleSort V2", numbers.length, startTime, stopTime);

    return numbers;
  }

  public static int[] selectionSort(int[] numbers){

    swapCount = 0;
    long startTime = System.nanoTime();

    int lastUnsortedIndex = numbers.length - 1;

    while(lastUnsortedIndex > 0){
      int maxIndex = 0;
      for(int i = 1; i <= lastUnsortedIndex; i++){
        if(numbers[i] > numbers[maxIndex]){
          maxIndex = i;
        }
      }
      swap(numbers, maxIndex, lastUnsortedIndex);
      lastUnsortedIndex--;
    }

    long stopTime = System.nanoTime();

    printRuntimeDuration("Selection Sort", numbers.length, startTime, stopTime);

    return numbers;
  }

  public static int[] quickSort(int[] numbers){
    swapCount = 0;
    long startTime = System.nanoTime();

    quickSort(numbers, 0, numbers.length-1);

    long stopTime = System.nanoTime();
    printRuntimeDuration("QuickSort", numbers.length, startTime, stopTime);
    return numbers;
  }

  private static void quickSort(int[] numbers, int left, int right){

    int indexLeft = left;
    int indexRight = right;

    if(left < right){
      int pivot = numbers[(indexLeft + indexRight) / 2];

      while(indexLeft <= indexRight){
        while(numbers[indexLeft] < pivot){
          indexLeft++;
        }
        while(numbers[indexRight] > pivot){
          indexRight--;
        }
        if(indexLeft <= indexRight){
          swap(numbers, indexLeft, indexRight);
          indexLeft++;
          indexRight--;
        }
      }

      if(left < indexRight){
        quickSort(numbers, left, indexRight);
      }
      if(indexLeft < right){
        quickSort(numbers, indexLeft, right);
      }

    }
  }



  /*
  Helper Methodes
  - print Array in one line
  - swap values in array (add swap count)
  - print Runtime Information for run
   */



  public static void printArray(int[] numbers){
    for(int number : numbers){
      System.out.print(number + ", ");
    }
    System.out.println();
  }

  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
    swapCount++;
  }

  private static void printRuntimeDuration(String algorithmName, int elementCount, long startTime, long endTime){
    long durationInNanoSeconds = endTime - startTime;
    long durationInMilliSeconds = (long) (durationInNanoSeconds / 10e5);

    System.out.println("Runtime for " + elementCount + " on " + algorithmName + ": " + durationInNanoSeconds + " ns (" + durationInMilliSeconds + " ms); SwapCount: " + swapCount);
  }

}
