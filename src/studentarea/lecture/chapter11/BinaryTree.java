package studentarea.lecture.chapter11;

public class BinaryTree<T extends Comparable<T>> {

  private Node root;

  public void add(T data) {
    addRecursive(root, data);
  }

  private void addRecursive(Node node, T data) {
    if (data.compareTo(node.data) < 0) {
      if (node.left == null) {
        node.left = new Node(data);
        return;
      }
      addRecursive(node.left, data);
    }
    else {
      if (node.right == null) {
        node.right = new Node(data);
        return;
      }
      addRecursive(node.right, data);
    }
  }

  private class Node {
    T data;
    Node left;
    Node right;

    Node(T data) {
      this.data = data;
    }

  }
}
