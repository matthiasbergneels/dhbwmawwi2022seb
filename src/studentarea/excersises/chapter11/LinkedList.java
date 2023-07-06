package studentarea.excersises.chapter11;

public class LinkedList<T> {

  private Node firstNode;

  void add(T data){
    Node newNode = new Node(data);

    if(firstNode == null){
      firstNode = newNode;
      return;
    }

    Node currentNode = firstNode;
    while(currentNode.nextNode != null)
      currentNode = currentNode.getNextNode();


    currentNode.setNextNode(newNode);
  }

  public T get(int index){
    Node ptr = this.firstNode;

    for(int i = 0; (i < index && ptr != null); i++)
      ptr = ptr.getNextNode();

    return ptr.getData();
  }

  public void setData(int index, T data){
    Node ptr = this.firstNode;
    Node newNode = new Node(data);

    if(index == 0) {
      newNode.setNextNode(this.firstNode.getNextNode());
      this.firstNode = newNode;
      return;
    }

    for(int i = 0; (i < index - 1 && ptr != null); i++)
      ptr = ptr.getNextNode();

    newNode.setNextNode(ptr.getNextNode().getNextNode());
    ptr.setNextNode(newNode);
  }

  public boolean contains(T data){
    Node ptr = this.firstNode;

    while(ptr != null) {
      if(ptr.data.equals(data))
        return true;
      ptr = ptr.getNextNode();
    }

    return false;
  }

  public boolean remove(T data) {
    boolean successfullyRemoved = false;
    if(this.firstNode.getData().equals(data)) {
      this.firstNode = this.firstNode.getNextNode();
      return true;
    }

    Node ptr = this.firstNode;
    while(ptr.getNextNode() != null) {
      Node nextPtr = ptr.getNextNode();
      if(nextPtr.data.equals(data)){
        ptr.setNextNode(nextPtr.getNextNode());
        return true;
      }
      ptr = ptr.nextNode;
    }


    return false;
  }

  public int size(){
    Node ptr = this.firstNode;
    int size = 0;

    while(ptr != null){
      ptr = ptr.nextNode;
      size++;
    }

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