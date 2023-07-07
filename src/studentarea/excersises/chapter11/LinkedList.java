package studentarea.excersises.chapter11;

import java.util.function.Predicate;

public class LinkedList<T> {

  private Node firstNode;

  void add(T data) {
    Node newNode = new Node(data);

    if (firstNode == null) {
      firstNode = newNode;
      return;
    }

    Node currentNode = firstNode;
    while (currentNode.nextNode != null) {
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);
  }

  public T get(int index) {
    return getNodeAt(index).data;
  }

  private Node getNodeAt(int index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index " + index + " exceeds list size");
    } else {
      int counter = 0;
      if (firstNode == null) {
        throw new IndexOutOfBoundsException("Index " + index + " exceeds list size");
      }
      Node currentNode = firstNode;
      while (index > counter) {
        if (currentNode.nextNode != null){
          currentNode = currentNode.nextNode;
          counter++;
        } else {
          throw new IndexOutOfBoundsException("Index " + index + " exceeds list size");
        }
      }
      return currentNode;
    }
  }

  public void setData(int index, T data) {
    getNodeAt(index).data = data;
  }

  public boolean contains(T data) {
    if (firstNode == null) {
      return false;
    }
    if (firstNode.data.equals(data)) {
      return true;
    }
    Node currentNode = firstNode;
    while (currentNode.nextNode != null) {
      currentNode = currentNode.getNextNode();
      if (currentNode.data.equals(data)) {
        return true;
      }
    }
    return false;
  }

  public boolean remove(T data) {
    if (firstNode == null) {
      return false;
    }
    if (firstNode.data.equals(data)) {
      firstNode = firstNode.nextNode;
      return true;
    }
    Node currentNode = firstNode;
    while (currentNode.nextNode != null) {
      if (currentNode.nextNode.data.equals(data)) {
        currentNode.nextNode = currentNode.nextNode.nextNode;
        return true;
      }
      currentNode = currentNode.nextNode;
    }
    return false;
  }

  public boolean removeIf(Predicate<? super T> filter){
    if (filter == null) {
      throw new IllegalArgumentException("Argument filter should not be null");
    }
    boolean removedAny = false;

    if (firstNode == null){
      return false;
    }

    if (filter.test(firstNode.data)) {
      firstNode = firstNode.nextNode;
      removedAny = true;
    }
    Node currentNode = firstNode;
    Node previousNode;
    while (currentNode.nextNode != null) {
      previousNode = currentNode;
      currentNode = currentNode.nextNode;
      if (filter.test(currentNode.data)) {
        previousNode.nextNode = currentNode.nextNode;
        removedAny = true;
      }
    }

    return removedAny;
  }

  public int size() {
    int size = 0;

    Node currentNode = firstNode;
    while (currentNode != null) {
      size++;
      currentNode = currentNode.getNextNode();
    }

    return size;
  }

  public void printList(){
    Node nextNode = firstNode;

    while(nextNode != null){
      System.out.println(nextNode.getData());
      nextNode = nextNode.getNextNode();
    }
  }

  public void printListRecursive() {
    printListRecursiveInner(firstNode);
  }

  private void printListRecursiveInner(Node currentNode) {
    if (currentNode == null) {
      return;
    }
    System.out.println(currentNode.getData());
    printListRecursiveInner(currentNode.getNextNode());
  }

  private class Node {
    T data;
    Node nextNode;

    Node(T data) {
      this.data = data;
    }

    T getData() {
      return data;
    }

    void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
    }

    Node getNextNode() {
      return nextNode;
    }

  }
}
