package lecture.chapter11;

public class BinaryTree<T extends Comparable> {

  private Node root = null;
  private int size = 0;

  public boolean add(T data){
    return false;
  }

  public int size(){
    return this.size;
  }

  private class Node{
    private final T data;
    private Node leftNode;
    private Node rightNode;

    public Node(T data){
      this.data = data;
      this.leftNode = null;
      this.rightNode = null;
    }

    public T getData(){
      return this.data;
    }

    public Node getLeftNode(){
      return this.leftNode;
    }

    public Node getRightNode(){
      return this.rightNode;
    }

    public void setLeftNode(Node leftNode){
      this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode){
      this.rightNode = rightNode;
    }
  }

}

