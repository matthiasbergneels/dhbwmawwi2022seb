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

  public void printTree(){
    if(rootNode != null){
      printRecursive(rootNode);
    }
  }

  private void printRecursive(Node currentNode){
    if(currentNode.getLeftChild() != null){
     printRecursive(currentNode.getLeftChild());
    }
    System.out.println(currentNode.getData());
    if(currentNode.getRightChild() != null){
      printRecursive(currentNode.getRightChild());
    }
  }

  public void printTreePreOrder(){
    if(rootNode != null){
      printTreePreOrder(rootNode);
    }
  }
  private void printTreePreOrder(Node currentNode){
    System.out.println(currentNode.getData());
    if(currentNode.getLeftChild() != null){
      printTreePreOrder(currentNode.getLeftChild());
    }
    if(currentNode.getRightChild() != null){
      printTreePreOrder(currentNode.getRightChild());
    }
  }

  public void printTreePostOrder(){
    if(rootNode != null){
      printTreePostOrder(rootNode);
    }
  }

  private void printTreePostOrder(Node currentNode){
    if(currentNode.getLeftChild() != null){
      printTreePostOrder(currentNode.getLeftChild());
    }
    if(currentNode.getRightChild() != null){
      printTreePostOrder(currentNode.getRightChild());
    }
    System.out.println(currentNode.getData());
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
