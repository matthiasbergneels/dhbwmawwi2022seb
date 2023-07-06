package lecture.chapter11;

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
    return null;
  }

  public void setData(int index, T data){

  }

  public boolean contains(T data){
    return false;
  }

  public boolean remove(T data){
    return false;
  }

  public int size(){
    return 0;
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
