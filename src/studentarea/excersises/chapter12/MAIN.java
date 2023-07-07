package studentarea.excersises.chapter12;

public class MAIN {
  public static void main(String[] args) {

    LinkedList<String> myLinkedList = new LinkedList<String>();

    myLinkedList.add("aa");
    myLinkedList.add("bb");
    myLinkedList.add("cc");

    System.out.println(myLinkedList.size());

    System.out.println(myLinkedList.contains("cc"));
    System.out.println(myLinkedList.remove("cc"));

    System.out.println(myLinkedList.contains("cc"));

    myLinkedList.setData(1,"abc");

    System.out.println(myLinkedList.get(1));

    System.out.println(myLinkedList.size());

    myLinkedList.printListRecursive();

    //BinaryTree
    BinaryTree myBinaryTree = new BinaryTree();

    myBinaryTree.insert(5);
    myBinaryTree.insert(7);
    myBinaryTree.insert(3);
    myBinaryTree.insert(2);
    myBinaryTree.insert(4);
    myBinaryTree.insert(6);
    myBinaryTree.insert(10);

    System.out.println(myBinaryTree.find(10));

    myBinaryTree.Ausgabe();
  }
}
