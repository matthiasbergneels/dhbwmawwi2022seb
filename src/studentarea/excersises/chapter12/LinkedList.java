package studentarea.excersises.chapter12;

public class LinkedList<T> {

  private Node firstNode;
  private int size=0;

  void add(T data){
    Node newNode = new Node(data);

    if(firstNode == null){
      firstNode = newNode;
      size++;
      return;
    }

    Node currentNode = firstNode;
    while(currentNode.nextNode != null){
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);
    size++;
  }

  public T get(int index) throws IndexOutOfBoundsException{
    if (this.size() <index+1) throw new IndexOutOfBoundsException();
    Node currentNode = firstNode;

    for (int i=0; i<index; i++) {
      currentNode = currentNode.getNextNode();
    }
    if (currentNode == null) throw new IndexOutOfBoundsException();
    return currentNode.getData();
  }

  public void setData(int index, T data) throws IndexOutOfBoundsException{
    if (this.size()< index+1) throw new IndexOutOfBoundsException();

    Node currentNode = firstNode;
    for (int i=0; i<index; i++) {
      currentNode = currentNode.getNextNode();
    }
    currentNode.data = data;
  }
  public boolean contains(T data){
    Node currentNode = firstNode;

    while(currentNode != null){
      if (currentNode.getData().equals(data)) return true;
      currentNode = currentNode.getNextNode();
    }
    return false;
  }

  public boolean remove(T data){
    if (firstNode == null) return false;
    if (firstNode.getData().equals(data)){
      firstNode = firstNode.getNextNode();
      size--;
      return true;
    }

    Node currentNode = firstNode;
    Node lastNode = firstNode;

    while(currentNode != null){
      if (currentNode.getData().equals(data)){
        lastNode.setNextNode(currentNode.getNextNode());
        size--;
        return true;
      }
      lastNode = currentNode;
      currentNode = currentNode.getNextNode();
    }
    return false;
  }

  public int size(){
    return size;
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