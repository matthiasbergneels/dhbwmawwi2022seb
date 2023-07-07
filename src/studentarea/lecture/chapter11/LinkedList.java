package studentarea.lecture.chapter11;

public class LinkedList<T> {

  private Node firstNode;

  private int size;

  void add(T data){
    Node newNode = new Node(data);

    if(firstNode == null){
      firstNode = newNode;
      return;
    }

    Node currentNode = firstNode;
    while (currentNode.nextNode != null){
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);

  }

  public T get(int index){
    if (index > size - 1)
      throw new IllegalArgumentException();
    Node current = firstNode;
    for (int i = 0; i < index; i++) {
      current = current.nextNode;
    }
    return current.data;
  }


  public void setData(int index, T data){
    if (index > size - 1)
      throw new IllegalArgumentException();
    Node current = firstNode;
    for (int i = 0; i < index; i++) {
      current = current.nextNode;
    }
    current.data = data;
  }

  public boolean contains(T data){
    for (Node current = this.firstNode; current != current.nextNode; current  = current.nextNode) {
      if (current.data.equals(data))
        return true;
    }
    return false;
  }

  public boolean remove(T data){
    if (this.size == 0)
      return false;

    if (this.firstNode.data.equals(data)) {
      this.firstNode = this.firstNode.nextNode;
    }
    Node previous = this.firstNode;
    Node current = this.firstNode.nextNode;

    while (current.nextNode != null) {
      if (current.data.equals(data)){
        previous.nextNode = current.nextNode;
        this.size--;
        return true;
      }
      previous = current;
      current = current.nextNode;
    }
    return false;
  }

  public int size(){
    return size;
  }

  public void printListRecursive() {
    printNext(firstNode);
  }

  private void printNext(Node node) {
    System.out.println(node.data);
    if (node.nextNode != null)
      printNext(node.nextNode);
  }

  private class Node{
    T data;
    Node nextNode;

    Node(T data){
      this.data = data;
    }

    T getData(){
      return data;
    }

    void setNextNode(Node nextNode){
      this.nextNode = nextNode;
    }

    Node getNextNode(){
      return nextNode;
    }


  }


}