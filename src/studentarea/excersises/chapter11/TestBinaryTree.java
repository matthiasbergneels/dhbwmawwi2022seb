package studentarea.excersises.chapter11;

public class TestBinaryTree {

  public static void main(String[] args) {
    Integer[] testNumbers = {50, 1, 23, 123, 34, 34, 21};
    BinaryTree binaryTree = new BinaryTree();

    System.out.println(binaryTree.isEmty());

    for (int i = 0; i < testNumbers.length; i++) {
      System.out.println("Neue Zahl: " + testNumbers[i]);
      System.out.println(binaryTree.addV1(testNumbers[i]));
      System.out.println(binaryTree.getItemSize());
    }


  }

}
