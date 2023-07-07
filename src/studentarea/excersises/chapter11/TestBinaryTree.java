package studentarea.excersises.chapter11;

public class TestBinaryTree {

  public static void main(String[] args) {
    Integer[] testNumbers = {50, 1, 23, 123, 34, 34, 21};
    BinaryTree binaryTree = new BinaryTree();

    System.out.println(binaryTree.isEmty());

    for (int i = 0; i < testNumbers.length; i++) {
      System.out.println("Neue Zahl: " + testNumbers[i]);
      System.out.println("Success: " + binaryTree.addRekusive(testNumbers[i]));
      System.out.println("Size: " + binaryTree.getItemSize());
    }

    System.out.println("In-Order");
    binaryTree.printInOrder();
    //Hier kann ich meinen Baum "kopieren"
    System.out.println("Pre-Order");
    binaryTree.printPreOrder();

    System.out.println("Post-Order");
    //Beim Löschen eines Knotens wieder verwenden von dem "Restbaum" unter dem zu löschendem Element
    binaryTree.printPostOrder();


  }

}
