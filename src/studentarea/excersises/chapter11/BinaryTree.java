package studentarea.excersises.chapter11;

public class BinaryTree<T extends Comparable<T>> {
  private Node root;

  private class Node {
    T data;
    Node lower;
    Node higher;

    Node(T data) {
      this.data = data;
    }
  }

  public void add(T data) {
    root = addRecursive(root, data);
  }

  private Node addRecursive(Node current, T data) {
    if (current == null) {
      return new Node(data);
    }

    if (data.compareTo(current.data) < 0) {
      current.lower = addRecursive(current.lower, data);
    } else if (data.compareTo(current.data) > 0) {
      current.higher = addRecursive(current.higher, data);
    }

    return current;
  }
}
