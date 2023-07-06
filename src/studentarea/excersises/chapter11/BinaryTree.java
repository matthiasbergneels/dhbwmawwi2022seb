package studentarea.excersises.chapter11;

public class BinaryTree {

  private Node root;
  private int itemSize;

  public int getItemSize() {
    return itemSize;
  }

  public boolean isEmty() {
    if (root == null) {
      return true;
    }
    return false;
  }

  public boolean add(int data) {
    Node newNode = new Node(data);

    if (isEmty()) {
      root = newNode;
      itemSize++;
      return true;
    }

    Node currentNode = root;
    Node currentNodeNext = currentNode;

    while (currentNodeNext != null) {

      if (newNode.data < currentNode.data){
        currentNodeNext = currentNode.left;

        if (currentNodeNext == null) {
          currentNode.left = newNode;
          itemSize++;
          return true;
        } else {

          currentNode = currentNode.left;
        }

      } else if (newNode.data > currentNode.data) {

        currentNodeNext = currentNode.right;
        if (currentNodeNext == null) {
          currentNode.right = newNode;
          itemSize++;
          return true;
        } else {
          currentNode = currentNode.right;
        }
      } else if (newNode.data == currentNode.data) {
        return false;
      }
    }

    return false;

  }

  class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }


  }

}
