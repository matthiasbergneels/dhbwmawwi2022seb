package studentarea.excersises.chapter11;

import java.util.Comparator;

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

  public boolean checkAndAdd(Node currentNode, Node newNode) {

    if (newNode.data < currentNode.data) {
      System.out.println("left");
      if (currentNode.left == null){
        currentNode.left = newNode;
        System.out.println("saved");
        return true;
      } else {
        return checkAndAdd(currentNode.left, newNode);
      }

    } else if (newNode.data > currentNode.data) {
      System.out.println("right");
      if (currentNode.right == null){
        currentNode.right = newNode;
        System.out.println("saved");
        return true;
      } else {
        return checkAndAdd(currentNode.right, newNode);
      }

    }

    return false;
  }

  public boolean addRekusive(int data) {
    Node newNode = new Node(data);

    if (isEmty()) {
      root = newNode;
      itemSize++;
      return true;
    }

    Boolean success = checkAndAdd(root, newNode);

    if (success) {
      itemSize++;
    }

    return success;

  }

  public boolean addV1(int data) {
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
        System.out.println("left");
        currentNodeNext = currentNode.left;

        if (currentNodeNext == null) {
          System.out.println("saved");
          currentNode.left = newNode;
          itemSize++;
          return true;
        } else {

          currentNode = currentNode.left;
        }

      } else if (newNode.data > currentNode.data) {
        System.out.println("right");

        currentNodeNext = currentNode.right;
        if (currentNodeNext == null) {
          System.out.println("saved");
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
