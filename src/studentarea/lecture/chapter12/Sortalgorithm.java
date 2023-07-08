package studentarea.lecture.chapter12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortalgorithm {

  public static void main(String[] args) {
    List<Integer> toSort = new ArrayList<>();
    for(int i = 9999; i > 0; i--){
      toSort.add(i);
    }
    int[] arrayToSort = new int[10000];
    for(int i = 9999; i > 0; i--){
      arrayToSort[i] = i;
    }


    double starttime = System.nanoTime();
    bubbleSort(toSort);
    System.out.println((System.nanoTime() - starttime)/1000000);
    toSort.clear();
    for(int i = 9999; i > 0; i--){
      toSort.add(i);
    }
    starttime = System.nanoTime();
    easyBubbleSort(toSort);
    System.out.println((System.nanoTime() - starttime)/1000000);
    starttime = System.nanoTime();
    bubbleSort(arrayToSort);
    System.out.println((System.nanoTime() - starttime)/1000000);
    for(int i = 9999; i > 0; i--){
      arrayToSort[i] = i;
    }
    starttime = System.nanoTime();
    easyBubbleSort(arrayToSort);
    System.out.println((System.nanoTime() - starttime)/1000000);

  }

  public static void bubbleSort(List<Integer> listToSort){
    boolean isSwapped = true;
    for(int i = 0; i < listToSort.size() && isSwapped; i++ ){
      isSwapped = false;
      for(int j = 1; j < listToSort.size() - i; j++){
        if(listToSort.get(j-1) > listToSort.get(j)){
          Collections.swap(listToSort, j, j-1);
          isSwapped = true;
        }
      }
    }
  }

  public static void easyBubbleSort(List<Integer> listToSort){
    for(int i = 0; i < listToSort.size(); i++){
      for(int j = 0; j < listToSort.size() - 1; j++){
        if(listToSort.get(j) < listToSort.get(j + 1)){
          Collections.swap(listToSort, j, j+1);
        }
      }
    }
  }

  public static void bubbleSort(int[] arrayToSort){
    boolean isSwapped = true;
    for(int i = 0; i < arrayToSort.length || isSwapped != false; i++ ){
      isSwapped = false;
      for(int j = 1; j < arrayToSort.length - i; j++){
        if(arrayToSort[j-1] > arrayToSort[j]){
          int temp = arrayToSort[j-1];
          arrayToSort[j] = arrayToSort[j-1];
          arrayToSort[j-1] = temp;
          isSwapped = true;
        }
      }
    }
  }
  public static void easyBubbleSort(int[] arrayToSort){
    for(int i = 0; i < arrayToSort.length; i++){
      for(int j = 0; j < arrayToSort.length - 1; j++){
        if(arrayToSort[j] < arrayToSort[j+1]){
          int temp = arrayToSort[j];
          arrayToSort[j] = arrayToSort[j+1];
          arrayToSort[j+1] = temp;
        }
      }
    }
  }

}
