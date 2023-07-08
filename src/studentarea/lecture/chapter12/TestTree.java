package studentarea.lecture.chapter12;

public class TestTree {
  public static void main(String[] args) {
    Tree<Integer> myTree = new Tree<>();
    myTree.add(4);
    myTree.add(2);
    myTree.add(3);
    myTree.add(1);
    myTree.add(6);
    myTree.add(5);
    myTree.add(7);
    System.out.println("Print in Order:");
    myTree.printTree();
    System.out.println("Print pre Order:");
    myTree.printTreePreOrder();
    System.out.println("Print post Order:");
    myTree.printTreePostOrder();

  }
}
