package studentarea.lecture.chapter11;

public class BinaryTree<T> {

  private Node root;
  private class Node {
    T data;
    Node left;
    Node right;

    Node(T data) {
      this.data = data;
    }

  }
}
