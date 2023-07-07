package studentarea.lecture.chapter12;

public class Tree<T extends Comparable> {

  private Node rootNode = null;

  private int size = 0;

  public int size(){
    return size;
  }

  public void add(T data){
    if(rootNode == null){
      rootNode = new Node(data);
      size++;
    }
    else{
      addDataToTree(data, rootNode);
    }
  }

  private void addDataToTree(T data,Node currentNode){
    if(data.compareTo(currentNode.data) < 0){
      if(currentNode.leftChild != null){
        addDataToTree(data,currentNode.leftChild);
      }
      else{
        currentNode.setLeftChild(data);
        size++;
      }
    }
    else if(data.compareTo(currentNode.data) > 0){
      if(currentNode.rightChild != null){
        addDataToTree(data,currentNode.rightChild);
      }
      else{
        currentNode.setRightChild(data);
        size++;
      }
    }
  }
  class Node{
    T data;
    Node leftChild;
    Node rightChild;
    Node(T data){
      this.data = data;
    }

    public T getData(){
      return this.data;
    }

    public void setLeftChild(T data){
      leftChild = new Node(data);
    }

    public Node getLeftChild(){
      return leftChild;
    }

    public void setRightChild(T data){
      rightChild = new Node(data);
    }

    public Node getRightChild(){
      return rightChild;
    }

  }
}
