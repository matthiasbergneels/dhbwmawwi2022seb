package studentarea.excersises.chapter11;

public class BinaryTree<T> {

  private Node root;

  public void add(T data){

  }

  public boolean remove(T data){
    return true;
  }
  public boolean contains(T data){
    return true;
  }

  private class Node{
    T data;
    Node left, right;

    public Node(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }

    public Node getLeft() {
      return left;
    }

    public void setLeft(Node left) {
      this.left = left;
    }

    public Node getRight() {
      return right;
    }

    public void setRight(Node right) {
      this.right = right;
    }
  }
}
