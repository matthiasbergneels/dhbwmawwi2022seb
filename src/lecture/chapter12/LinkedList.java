package lecture.chapter12;

public class LinkedList<T> {

  private Node firstNode;
  private int size;

  void add(T data){
    Node newNode = new Node(data);

    if(firstNode == null){
      firstNode = newNode;
      size++;
      return;
    }

    Node currentNode = firstNode;
    while(currentNode.getNextNode() != null){
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);
    size++;
  }

  public T get(int index){
    if(index >= size || index < 0){
      throw new IndexOutOfBoundsException();
    }

    if(index == 0){
      return firstNode.getData();
    }

    Node currentNode = firstNode;
    while(index > 0){
      currentNode = currentNode.getNextNode();
      index--;
    }

    return currentNode.getData();
  }

  public void setData(int index, T data){
    if(index >= size || index < 0){
      throw new IndexOutOfBoundsException();
    }

    Node newNode = new Node(data);

    if(index == 0){
      newNode.setNextNode(firstNode.getNextNode());
      firstNode = newNode;
      return;
    }

    Node currentNode = firstNode;
    while(index - 1 > 0){
      currentNode = currentNode.getNextNode();
      index--;
    }

    newNode.setNextNode(currentNode.getNextNode().getNextNode());
    currentNode.setNextNode(newNode);
  }

  public boolean contains(T data){
    if(firstNode == null){
      return false;
    }

    Node currentNode = firstNode;
    do{
      if(currentNode.getData().equals(data)){
        return true;
      }
      currentNode = currentNode.getNextNode();
    }while(currentNode != null);
    return false;
  }

  public boolean remove(int index){
    return false;
  }

  public boolean remove(T data){
    if(firstNode != null){

      if(firstNode.getData().equals(data)){
        firstNode = firstNode.getNextNode();
        size--;
        return true;
      }

      Node currentNode = firstNode;
      while(currentNode.getNextNode() != null){
        if(currentNode.getNextNode().getData().equals(data)){
          currentNode.setNextNode(currentNode.getNextNode().getNextNode());
          size--;
          return true;
        }
        currentNode = currentNode.getNextNode();
      }

    }
    return false;
  }

  public int size(){
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
    if(firstNode == null){
      System.out.println("Liste ist leer!");
      return;
    }
    printListRecursive(firstNode);
  }

  private void printListRecursive(Node currentNode){
    System.out.println(currentNode.getData());
    if(currentNode.getNextNode() != null){
      printListRecursive(currentNode.getNextNode());
    }
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
