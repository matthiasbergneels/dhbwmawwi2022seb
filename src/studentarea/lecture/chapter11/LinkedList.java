package studentarea.lecture.chapter11;

public class LinkedList<T> {

  private Node firstNode;
  private int size;

  void add(T data) {
    Node newNode = new Node(data);

    if (firstNode == null) {
      firstNode = newNode;
      size++;
      return;
    }

    Node currentNode = firstNode;
    while (currentNode.getNextNode() != null) {
      currentNode = currentNode.getNextNode();  //jedes Mal das ausführen bis du Null-Pinter findest
    }

    currentNode.setNextNode(newNode);  //schreibe dort das neue Datum
    size++;
  }

  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }

    Node currentNode = firstNode;
    for (int i = 0; i < index; i++) {
      currentNode = currentNode.getNextNode();
    }

    return currentNode.getData();
  }

  public void setData(int index, T data) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }

    Node currentNode = firstNode;
    for (int i = 0; i < index; i++) {
      currentNode = currentNode.getNextNode();
    }

    currentNode.setData(data);
  }

  public boolean contains(T data) {
    Node currentNode = firstNode;
    while (currentNode != null) {
      if (currentNode.getData().equals(data)) {
        return true;
      }
      currentNode = currentNode.getNextNode();
    }
    return false;
  }

  public boolean remove(T data) {
    if (firstNode == null) {
      return false;
    }



    if (firstNode.getData().equals(data)) {
      firstNode = firstNode.getNextNode();
      size--;
      return true;
    }

    Node currentNode = firstNode;
    while (currentNode.getNextNode() != null) {
      if (currentNode.getNextNode().getData().equals(data)) {
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        size--;
        return true;
      }
      currentNode = currentNode.getNextNode();
    }

    return false;
  }

  public int size() {
    return size;
  }

  public void printList(){
    Node nextNode = firstNode;

    while(nextNode != null){
      System.out.println(nextNode.getData());
      nextNode = nextNode.getNextNode();
    }
  }

  public void printListRecursive(){
    // TODO
    printListRecursive(firstNode);
  }

  private void printListRecursive(Node currentNode){
    if (currentNode == null) {
      System.out.println("Liste leer!");
    }

    if (currentNode != null){
      System.out.println(currentNode.getData());
      printListRecursive(currentNode.getNextNode());
    }
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

    void setData(T data) {
      this.data = data;
    }

    void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
    }

    Node getNextNode() {
      return nextNode;
    }
  }
}
