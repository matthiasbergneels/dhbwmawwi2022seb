package studentarea.lecture.chapter11;

public class BinaryTree<T extends Comparable> {

  private Node root = null;
  private int size = 0;

  public boolean add(T data) {
    if (root == null) {
      root = new Node(data);
      size++;
      return true;
    } else {
      return addRecursive(root, data);
    }
  }

  private boolean addRecursive(Node currentNode, T data) {
    if (data.compareTo(currentNode.getData()) < 0) { //falls die Daten links liegen
      if (currentNode.getLeftNode() == null) {
        currentNode.setLeftNode(new Node(data));
        size++;
        return true;
      } else {
        return addRecursive(currentNode.getLeftNode(), data);
      }
    } else if (data.compareTo(currentNode.getData()) > 0) {  //falls die Daten rechts liegen
      if (currentNode.getRightNode() == null) {
        currentNode.setRightNode(new Node(data));
        size++;
        return true;
      } else {
        return addRecursive(currentNode.getRightNode(), data);
      }
    } else {
      // Data already exists in the tree
      return false;
    }
  }




  public int size() {
    return this.size;
  }

  private class Node {
    private final T data;
    private Node leftNode;
    private Node rightNode;

    public Node(T data) {
      this.data = data;
      this.leftNode = null;
      this.rightNode = null;
    }

    public T getData() {
      return this.data;
    }

    public Node getLeftNode() {
      return this.leftNode;
    }

    public Node getRightNode() {
      return this.rightNode;
    }

    public void setLeftNode(Node leftNode) {
      this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
      this.rightNode = rightNode;
    }
  }

}
