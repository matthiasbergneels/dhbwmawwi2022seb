package studentarea.excersises.chapter11;

public class LinkedListV1<T> {


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

  private Node goToIndex(int index) throws IndexOutOfBoundsException{
    Node currentNode = firstNode;

    if (isEmty()){
      throw new IndexOutOfBoundsException();
    }

    if (index > size() - 1) {
      throw new IndexOutOfBoundsException();
    }

    for (int i = 0; i < index; i++) {
      currentNode = currentNode.nextNode;
    }

    return currentNode;

  }

  private void printNextValue(Node currentValue) {
    System.out.println(currentValue.data);
    if (currentValue.nextNode != null){
      printNextValue(currentValue.nextNode);

    }

  }

  public void printListRecursive() {
    if (isEmty()) {
      System.out.println("List empty");
      return;
    }
    System.out.println("Rekusiver Print: ");

    printNextValue(firstNode);




  }

  public T get(int index) throws IndexOutOfBoundsException {
    if (isEmty()){
      throw new IndexOutOfBoundsException();
    }

    if (index > size() - 1) {
      throw new IndexOutOfBoundsException();
    }

    Node currentNode = goToIndex(index);

    return currentNode.data;
  }

  public void setData(int index, T data) throws IndexOutOfBoundsException {

    Node newNode = new Node(data);

    if (index == 0) {

      newNode.nextNode = firstNode.nextNode;
      firstNode = newNode;
      return;
    }

    Node oldNode = goToIndex(index);
    Node oldNodePrev = goToIndex(index - 1);

    newNode.nextNode = oldNode.nextNode;
    oldNodePrev.nextNode = newNode;
  }

  public boolean contains(T data){
    Node currentNode = firstNode;

    if (isEmty()) {
      return false;
    }

    while (currentNode.nextNode != null) {

      if (currentNode.data.equals(data)) {
        return true;
      }

      currentNode = currentNode.nextNode;
    }

    return false;
  }

  public boolean remove(T data){
    Node currentNode = firstNode;
    int indexOfDel = 0;

    if (isEmty()) {
      return false;
    }

    if (contains(data) == false) {
      return false;
    }


    while (currentNode.nextNode != null) {


      if (currentNode.data.equals(data)) {
        if (currentNode == firstNode) {
          firstNode = firstNode.nextNode;
          return true;
        }


        Node prev = goToIndex(indexOfDel - 1);
        prev.nextNode = currentNode.nextNode;
        return true;
      }
      currentNode = currentNode.nextNode;
      indexOfDel++;

    }


    return false;
  }

  public boolean isEmty() {
    if (firstNode == null){
      return true;
    } else return false;

  }

  public int size(){
    int size = 0;

    if (isEmty()) {
      return size;
    }

    Node currentNode = firstNode;

    size = 1;

    while (currentNode.nextNode != null) {
      currentNode = currentNode.nextNode;
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
