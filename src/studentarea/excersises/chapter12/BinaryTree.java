package studentarea.excersises.chapter12;

import java.util.Comparator;

public class BinaryTree<T extends Comparable> {
  private Node Root;
  private int size =0;

  public boolean insert(T Data){
    Node currenNode = new Node(Data);
    if (Root == null){
      Root = currenNode;
      this.size++;
      return true;
    }
    return put(Root, currenNode);
  }
  private boolean put(Node prevNode, Node currentNode){
    int compareNodes = prevNode.getData().compareTo(currentNode.getData());

    if (compareNodes < 0) {
      if (prevNode.getRightNode() != null) {
        put(prevNode.getRightNode(), currentNode);
        return true;
      }
      prevNode.setRightNode(currentNode);
      this.size++;

    }else if(compareNodes > 0){
      if (prevNode.getLeftNode() != null) {
        put(prevNode.getLeftNode(), currentNode);
        return true;
      }
      prevNode.setLeftNode(currentNode);
      this.size++;
    }else {
      return false;
    }
    return false;
  }
  public T find(T data){
    Node currentnode = new Node(data);
    return search(Root, currentnode);
  }

  private T search(Node currentNode, Node data){
    int compareNodes = currentNode.getData().compareTo(data.getData());

    if (compareNodes == 0) {
      return currentNode.getData();
    }

    if (compareNodes < 0) {
      if (currentNode.getRightNode() != null) {
        return search(currentNode.getRightNode(), data);
      }
    }else{
      if (currentNode.getLeftNode() != null) {
        return search(currentNode.getLeftNode(), data);
      }
    }
    return null;
  }
  public int size (){
    return this.size;
  }
  public boolean remove(){
    return false;
  }

  public void printInOrder(){
    if(Root == null){
      System.out.println("Der Baum ist leer.");
      return;
    }
    printInOrder(Root);
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
    if(Root == null){
      System.out.println("Der Baum ist leer.");
      return;
    }
    printPreOrder(Root);
  }

  private void printPreOrder(Node currentNode){

  }

  // post-order -> left - right - current
  public void printPostOrder(){
    if(Root == null){
      System.out.println("Der Baum ist leer.");
      return;
    }
    printPostOrder(Root);
  }
  private void printPostOrder(Node currentNode){
    if(currentNode.getRightNode() != null){
      printPostOrder(currentNode.getRightNode());
    }
    System.out.println(currentNode.getData());
    if(currentNode.getLeftNode() != null){
      printPostOrder(currentNode.getLeftNode());
    }
  }

  //TestAusgabe
  public void Ausgabe(){
    System.out.println("   "+Root.getData());
    System.out.println("  "+Root.Left.getData()+" "+Root.Right.getData());
    System.out.println(Root.Left.Left.getData() +" "+Root.Left.Right.getData()+" "+ Root.Right.Left.getData()+" " +Root.Right.Right.getData());
  }

  private class Node {
    private Node Left;
    private Node Right;
    private final T data;
    Node(T data){
      this.data = data;
      this.Left = null;
      this.Right = null;
    }
    public Node getLeftNode(){
      return this.Left;
    }

    public Node getRightNode(){
      return this.Right;
    }

    public void setLeftNode(Node leftNode){
      this.Left = leftNode;
    }

    public void setRightNode(Node rightNode){
      this.Right = rightNode;
    }

    public T getData(){
      return this.data;
    }
  }
}
