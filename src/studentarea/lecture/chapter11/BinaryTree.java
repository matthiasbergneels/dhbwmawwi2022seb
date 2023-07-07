package studentarea.lecture.chapter11;

public class BinaryTree<T> {


  private Node root;

  private class Node {
    private Node leftNode;
    private Node rightNode;
    private T data;

    Node(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public Node getLeftNode() {
      return leftNode;
    }
    public Node getRightNode() {
      return rightNode;
    }

    public void setleftNode(Node leftNode) {
      this.leftNode = leftNode;
    }
    public void setrightNode(Node rightNode) {
      this.rightNode = rightNode;
    }

    public void add(T data) {

    }
  }


}
