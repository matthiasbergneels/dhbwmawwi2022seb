package studentarea.excersises.chapter12;

public class Algorithmen {


  public static Integer[] optBubbleSort(Integer[] data) {
    Boolean swapped = true;
    Integer iterations = 0;

    while(swapped) {
      swapped = false;
      iterations++;

      for(int i = 0; i < data.length -iterations; i++){
        if (data[i] > data[i+1]) {
          Integer temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
          swapped = true;

        }


      }

    }


    return data;
  }

  public static Integer[] normalBubbleSort(Integer[] data) {


    for (int j = 0; j < data.length; j++) {
      for(int i = 0; i < data.length -1; i++){
        if (data[i] > data[i+1]) {
          Integer temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;

        }


      }


    }

    return data;

  }

  public static Integer[] insertionSort(Integer[] data) {

    int lastUnsortedIndex = data.length - 1;

    while (lastUnsortedIndex > 0) {
      Integer maxIndex = 0;

      for (int i = 1; i <= lastUnsortedIndex; i++) {
        if (data[i] > data[maxIndex]) {
          maxIndex = i;
        }

        Integer puffer = data[maxIndex];
        data[maxIndex] = data[i];
        data[i] = puffer;


      }

      lastUnsortedIndex --;

    }

    return data;

  }


}
