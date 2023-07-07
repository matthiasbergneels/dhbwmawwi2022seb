package studentarea.lecture.chapter12;

public class ListTest {
  public static void main(String[] args) {
    LinkedList<Integer> myLinkedList = new LinkedList<>();

    myLinkedList.add(23);
    myLinkedList.add(24);
    myLinkedList.add(25);

    System.out.println(myLinkedList.contains(24));
    System.out.println(myLinkedList.size());
    System.out.println("==============print list");
    myLinkedList.printList();
    System.out.println("==============end print list");
    myLinkedList.remove(24);
    System.out.println(myLinkedList.contains(24));
    System.out.println(myLinkedList.size());
    System.out.println(myLinkedList.get(0));
    myLinkedList.setData(0,12);
    System.out.println(myLinkedList.get(0));
    System.out.println("==============print list");
    myLinkedList.printList();
    System.out.println("==============end print list");

  }
}
