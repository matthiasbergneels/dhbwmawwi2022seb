package studentarea.excersises.chapter11;

public class TestLinkedListV1 {

  public static void main(String[] args) {
    LinkedListV1<String> list = new LinkedListV1<>();
    //System.out.println("Is Empty:" + list.isEmty());

    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");
    list.add("6");

    /*
    System.out.println("Is Empty:" + list.isEmty());
    System.out.println("Contains 2:" + list.contains("2"));
    System.out.println("Size:" + list.size());

    printListContent(list);

    System.out.println("Contains 1:" + list.contains("1"));

    list.remove("1");
    list.setData(0, "44");
    list.setData(2, "4567");

     */



    list.printListRecursive();




  }

  public static void printListContent(LinkedListV1 list) {
    try {
      for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
      }

    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());

    }

  }

}
