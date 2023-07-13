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


  public void printInOrder(){
    if(root == null){
      System.out.println("Der Baum ist leer.");
      return;
    }
    printInOrder(root);
  }
  private void printInOrder(Node currentNode){
    if(currentNode.getLeftNode() != null){
      printInOrder(currentNode.getLeftNode());
    }
    System.out.println(currentNode.getData());
    if(currentNode.getRightNode() != null){
      printInOrder(currentNode.getRightNode());
    }
  }

  // pre-order -> current - left - right
  public void printPreOrder(){
    if(root == null){
      System.out.println("Der Baum ist leer.");
      return;
    }
    // TODO
    printPreOrder(root);
  }

  private void printPreOrder(Node currentNode){
    if (currentNode != null) {
      printPreOrder(currentNode);
    }
    System.out.println(currentNode.getData());
    if (currentNode.getLeftNode() != null) {
      printPreOrder(currentNode.getLeftNode());
    }
    if(currentNode.getRightNode() != null){
      printPreOrder(currentNode.getRightNode());
    }
  }

  // post-order -> left - right - current
  public void printPostOrder(){
    if(root == null){
      System.out.println("Der Baum ist leer.");
      return;
    }
    // TODO
    printPostOrder(root);
  }

  private void printPostOrder(Node currentNode){

    if (currentNode.getLeftNode() != null) {
      printPreOrder(currentNode.getLeftNode());
    }
    if(currentNode.getRightNode() != null){
      printPreOrder(currentNode.getRightNode());
    }
    if (currentNode != null) {
      printPreOrder(currentNode);
    }
    System.out.println(currentNode.getData());
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
