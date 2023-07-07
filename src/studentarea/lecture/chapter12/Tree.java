package studentarea.lecture.chapter12;

public class Tree<T> {

  private Node rootNode;
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
