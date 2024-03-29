package lecture.chapter12;

public class LinkedListExample {

  public static void main(String[] args) {
    LinkedList<String> textList = new LinkedList<>();

    textList.add("Java");
    textList.add("ist");
    textList.add("super");
    textList.add("toll");
    textList.add("Amen");

    System.out.println("Länge:" + textList.size());

    textList.printList();

    System.out.println("Java enthalten? " + textList.contains("Java"));
    System.out.println("Python enthalten? " + textList.contains("Python"));

    System.out.println("Amen löschen? " + textList.remove("Amen"));
    System.out.println("Länge:" + textList.size());

    textList.setData(2, "mega");

    System.out.println("Iterative Ausgabe: ");
    textList.printList();

    System.out.println("Rekursive Ausgabe :P ");
    textList.printListRecursive();
  }
}
