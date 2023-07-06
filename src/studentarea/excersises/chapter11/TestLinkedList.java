package studentarea.excersises.chapter11;

import java.util.ArrayList;

public class TestLinkedList {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);


    linkedList.setData(2,5);
    linkedList.add(5);
    System.out.println(linkedList.contains(5));
    linkedList.remove(5);
    System.out.println(linkedList.contains(5));

  }
}
