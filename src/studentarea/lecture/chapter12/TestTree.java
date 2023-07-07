package studentarea.lecture.chapter12;

public class TestTree {
  public static void main(String[] args) {
    Tree<Integer> myTree = new Tree<>();
    myTree.add(2);
    myTree.add(3);
    System.out.println(myTree.size());
    myTree.add(3);
    System.out.println(myTree.size());
    myTree.add(5);
    System.out.println(myTree.size());
  }
}
