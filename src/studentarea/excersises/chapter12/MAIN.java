package studentarea.excersises.chapter12;

public class MAIN {
  public static void main(String[] args) {
    /*
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

    System.out.println(myLinkedList.size());*/

    //BinaryTree
    BinaryTree myBinaryTree = new BinaryTree();

    myBinaryTree.add(5);
    myBinaryTree.add(7);
    myBinaryTree.add(3);
    myBinaryTree.add(2);
    myBinaryTree.add(4);
    myBinaryTree.add(6);
    myBinaryTree.add(10);


    System.out.println(myBinaryTree.get(10));

    myBinaryTree.Ausgabe();
  }
}
