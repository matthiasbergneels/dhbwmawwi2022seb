package studentarea.lecture.chapter11;

public class CusomLinkedList<T> {
  private Node head;
  private int size;

  public CusomLinkedList() {
    this.size = 0;
  }

  public void append(T data) {
    if (size == 0) {
      this.head = new Node(data);
      size++;
      return;
    }
    Node current = head;
    while (current.next != null)  {
      current = current.next;
    }
    current.next = new Node(data);
    size++;
  }

  public void print() {
    if (size == 0) {
      System.out.println("Empty List");
    }
    for (Node current = head; current.next != null; current = current.next) {
      System.out.println(current.data);
    }

  }

  private class Node {
    T data;
    Node next;

    Node(T data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    CusomLinkedList<Integer> list = new CusomLinkedList<>();
    list.append(3);
    list.print();
  }
}
