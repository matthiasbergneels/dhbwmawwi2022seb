package studentarea.excersises.chapter12;

public class BinaryTree {
  private Node Root;

  public void add(int Data){
    Node currenNode = new Node(Data);
    if (Root == null){
      Root = currenNode;
      return;
    }
    try {
      put(Root, currenNode);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  private void put(Node prevNode, Node currentNode) throws RuntimeException{
    if (prevNode.getData() < currentNode.getData() ) {
      if (prevNode.Right != null) {
        put(prevNode.Right, currentNode);
        return;
      }
      prevNode.Right = currentNode;

    }else if(prevNode.getData() > currentNode.getData()){
      if (prevNode.Left != null) {
        put(prevNode.Left, currentNode);
        return;
      }
      prevNode.Left = currentNode;
    }else{
      throw new RuntimeException("das gibt es schon");
    }
    return;
  }
  public int get(int data){
    Node currentnode = new Node(data);
    return search(Root, currentnode);
  }

  private int search(Node currentNode, Node data){
    if (currentNode.getData() == data.getData()){
      return currentNode.getData();
    }

    if (currentNode.getData() < data.getData() ) {
      if (currentNode.Right != null) {
        return search(currentNode.Right, data);

      }
      return -1;
    }else{
      if (currentNode.Left != null) {
        return search(currentNode.Left, data);
      }
      return -1;
    }
  }

  public void Ausgabe(){
    System.out.println("   "+Root.getData());
    System.out.println("  "+Root.Left.getData()+" "+Root.Right.getData());
    System.out.println(Root.Left.Left.getData() +" "+Root.Left.Right.getData()+" "+ Root.Right.Left.getData()+" " +Root.Right.Right.getData());
  }

  private class Node {
    private Node Left;
    private Node Right;
    private int data;
    Node(int data){
      this.data = data;
    }

    public int getData(){
      return this.data;
    }
  }
}
