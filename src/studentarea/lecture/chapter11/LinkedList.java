package studentarea.lecture.chapter11;

public class LinkedList<T> {

  private Node firstNode;
  private int amount = 0;

  void add(T data){
    amount += 1;
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
    if(index > amount || index < 0) {
      throw new IndexOutOfBoundsException();
    }

    Node currentNode = firstNode;

    for(int i = 0; i < index; i++){
      currentNode = currentNode.getNextNode();
    }

    return currentNode.getData();
  }

  public void setData(int index, T data){

  }

  public boolean contains(T data){
    Node currentNode = firstNode;

    while(currentNode != null){
      if (currentNode.getData().equals(data)){
        return true;
      }
      currentNode = currentNode.getNextNode();
    }

    return false;
  }

  public boolean remove(T data){
    if(firstNode.getData().equals(data)) {
      firstNode = firstNode.getNextNode();
      amount -= 1;
      return true;
    }

    Node currentNode = firstNode;
    while(currentNode.getNextNode() != null){
      if(currentNode.getNextNode().getData().equals(data)) {
        amount -= 1;
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());

        return true;
      }
      currentNode = currentNode.getNextNode();
    }


    return false;
  }

  public int size(){
    return amount;
  }

  public void printList() {
    Node currentNode = firstNode;
    while(currentNode != null) {
      System.out.println(currentNode.getData());
      currentNode = currentNode.getNextNode();
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
