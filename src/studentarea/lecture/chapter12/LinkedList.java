package studentarea.lecture.chapter12;

public class LinkedList<T> {

  private Node firstNode;

  void add(T data){
    Node newNode = new Node(data);

    if(firstNode == null){
      firstNode = newNode;
      return;
    }

    Node currentNode = firstNode;
    while(currentNode.nextNode != null){
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);
  }

  public T get(int index){
    if(firstNode == null){
      return null;
    }
    Node currentNode = firstNode;
    for(int i = 0; i != index; i++){
      if(currentNode.nextNode == null){
       return null;
      }
      currentNode = currentNode.getNextNode();
    }
    return currentNode.getData();
  }

  public void setData(int index, T data){
    if(firstNode == null){
        throw new IndexOutOfBoundsException();
    }
    Node currentNode = firstNode;
    Node lastNode = firstNode;
    for(int i = 0; i < index; i++){
      if(currentNode.nextNode == null){
        throw new IndexOutOfBoundsException();
      }
      lastNode = currentNode;
      currentNode = currentNode.getNextNode();
    }
    Node nodeToSet = new Node(data);
    if(currentNode == firstNode){
      firstNode = nodeToSet;
    }
    else{
      lastNode.nextNode = nodeToSet;
    }
    nodeToSet.nextNode = currentNode.nextNode;

    currentNode.nextNode = null;
  }

  public boolean contains(T data){
    if(firstNode == null){
      return false;
    }
    Node currentNode = firstNode;
    while(currentNode.nextNode != null){
      if(currentNode.getData() == data){
        return true;
      }
      currentNode = currentNode.getNextNode();
    }
    return false;
  }

  public boolean remove(T data){
    if(firstNode == null){
      return false;
    }
    Node currentNode = firstNode;
    Node lastNode = firstNode;
    while(currentNode.nextNode != null) {
      if(currentNode.getData() == data){
        lastNode.nextNode = currentNode.getNextNode();
        return true;
      }
      lastNode = currentNode;
      currentNode = currentNode.getNextNode();
    }
    return false;
  }

  public int size(){
    if(firstNode == null){
      return 0;
    }
    int count = 1;
    Node currentNode = firstNode;
    while(currentNode.nextNode != null) {
      count = count + 1;
      currentNode = currentNode.getNextNode();
    }
    return count;
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
