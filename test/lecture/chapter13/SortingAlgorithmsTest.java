package lecture.chapter13;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SortingAlgorithmsTest {

  static int count = 20000;
  static int randomRange = 3000000;
  static int[] toSort = null;

  @Nested
  @DisplayName("Standard Sort cases on random generated Arrays")
  class StandardRandomSortCases {
    @BeforeAll
    static void setUp() {
      generateArray();
    }

    @Test
    void bubbleSort() {
      int[] sortedArray = SortingAlgorithms.bubbleSort(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }

    @Test
    void bubbleSortV2() {
      int[] sortedArray = SortingAlgorithms.bubbleSortV2(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }

    @Test
    void selectionSort() {
      int[] sortedArray = SortingAlgorithms.selectionSort(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }

    @Test
    void quickSort() {
      int[] sortedArray = SortingAlgorithms.quickSort(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }
    @Test
    void quickSortTime(){
      assertTimeout(Duration.ofMillis(1), ()->{int[] sortedArray = SortingAlgorithms.quickSort(toSort.clone());});
    }

  }

  @Nested
  @DisplayName("Sort cases on ordered Arrays")
  class SortCasesOnOrderdArrays {
    @BeforeAll
    static void setUp() {
      generateOrderedArray();
    }

    @Test
    void bubbleSort() {
      int[] sortedArray = SortingAlgorithms.bubbleSort(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }

    @Test
    void bubbleSortV2() {
      int[] sortedArray = SortingAlgorithms.bubbleSortV2(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }

    @Test
    void selectionSort() {
      int[] sortedArray = SortingAlgorithms.selectionSort(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }

    @Test
    void quickSort() {
      int[] sortedArray = SortingAlgorithms.quickSort(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }
  }

  @Nested
  @DisplayName("Sort cases on reverse ordered Arrays")
  class SortCasesOnReverseOrderdArrays {
    @BeforeAll
    static void setUp() {
      generateReverseOrderedArray();
    }

    @Test
    void bubbleSort() {
      int[] sortedArray = SortingAlgorithms.bubbleSort(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }

    @Test
    void bubbleSortV2() {
      int[] sortedArray = SortingAlgorithms.bubbleSortV2(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }

    @Test
    void selectionSort() {
      int[] sortedArray = SortingAlgorithms.selectionSort(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }

    @Test
    void quickSort() {
      int[] sortedArray = SortingAlgorithms.quickSort(toSort.clone());
      assertTrue(isSorted(sortedArray));
    }
  }

  private static void generateOrderedArray() {
    toSort = new int[count];
    for(int i = 0; i < count; i++){
      toSort[i] = i + 1;
    }
  }

  private static void generateReverseOrderedArray() {
    toSort = new int[count];
    for(int i = 0; i < count; i++){
      toSort[i] = toSort.length - i;
    }
  }

  private static boolean isSorted(int[] array){
    for(int i = 0; i < array.length-1; i++){
      if(array[i] > array[i+1]){
        return false;
      }
    }
    return true;
  }


  private static void generateArray(){
    toSort = new int[count];
    for(int i = 0; i < count; i++){
      boolean notInserted = true;
      while(notInserted){
        int randomNumber = (int)(Math.random() * randomRange);

        boolean found = false;
        for(int j = 0; j < i; j++){
          if(toSort[j] == randomNumber){
            found = true;
            break;
          }
        }

        if(!found){
          toSort[i] = randomNumber;
          notInserted = false;
        }

      }
    }
  }
}