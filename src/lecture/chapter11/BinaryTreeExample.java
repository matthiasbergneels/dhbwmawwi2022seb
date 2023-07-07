package lecture.chapter11;

public class BinaryTreeExample {

  public static void main(String[] args) {

    BinaryTree<Integer> numberTree = new BinaryTree<>();

    numberTree.add(100);
    numberTree.add(50);
    numberTree.add(60);
    numberTree.add(30);
    numberTree.add(150);
    numberTree.add(170);
    System.out.println("Hinzufügen - 160:" + numberTree.add(160));
    System.out.println("Hinzufügen - 160:" + numberTree.add(160));
    numberTree.add(200);

    System.out.println("Anzahl an Elementen: " + numberTree.size());

  }
}
