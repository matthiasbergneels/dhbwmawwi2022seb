package lecture.chapter11;

public class BinaryTreeExample {
    public static void main(String[] args) {
        BinaryTree<Integer> intTree = new BinaryTree<>();

        intTree.add(3);
        intTree.add(1);
        intTree.add(2);
        intTree.add(4);
        intTree.add(7);

        System.out.println("Länge:" + intTree.size());
    }
}
