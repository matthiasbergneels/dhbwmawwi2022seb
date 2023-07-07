package studentarea.excersises.chapter11;

public class BinaryTree<T extends Comparable<T>> {

  private Node<T> root;

  private static class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    Node(T value) {
      this.value = value;
      right = null;
      left = null;
    }
  }

  public void add(T value) {
    root = add(root, value);
  }

  private Node<T> add(Node<T> current, T value) {
    if (current == null) {
      return new Node<>(value);
    }

    if (value.compareTo(current.value) < 0) {
      current.left = add(current.left, value);
    } else if (value.compareTo(current.value) > 0) {
      current.right = add(current.right, value);
    } else {
      return current;
    }

    return current;
  }

  public boolean containsNode(T value) {
    return containsNode(root, value);
  }

  private boolean containsNode(Node<T> current, T value) {
    if (current == null) {
      return false;
    }

    if (value.compareTo(current.value) == 0) {
      return true;
    }

    return value.compareTo(current.value) < 0
      ? containsNode(current.left, value)
      : containsNode(current.right, value);
  }
}
