package lecture.chapter11;

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

    textList.printList();
  }
}
