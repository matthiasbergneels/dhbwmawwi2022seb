package lecture.chapter9;

import java.util.*;

public class MapExample {

  public static void main(String[] args) {

    Map<Integer, String> colorCodes = new TreeMap<>();

    int key1000 = 1000;

    Integer keyObject1000 = Integer.valueOf(1000);

    int result = 2000 + keyObject1000;
    result = 2000 + 1000;
    result = 2000 + key1000;

    colorCodes.put(key1000, "rot");
    colorCodes.put(2000, "blau");
    colorCodes.put(3000, "lila");
    colorCodes.put(4000, "gelb");
    colorCodes.put(5000, "gelb");
    colorCodes.put(1000, "grün"); // --> überschreibt den Wert an dem Schlüssel 1000

    // Hilfsmethoden von Wrapper-Klassen
    Integer.parseInt("500");
    Boolean.hashCode(true);

    System.out.println("Wert für Schlüssel 2000: " + colorCodes.get(2000));
    System.out.println("Wert für Schlüssel 1000: " + colorCodes.get(1000));
    System.out.println("Anzahl Elemente: " + colorCodes.size());

    colorCodes.remove(3000);

    System.out.println("Anzahl Elemente: " + colorCodes.size());

    Set<Integer> colorKeys = colorCodes.keySet();

    Iterator<Integer> colorKeyIterator = colorKeys.iterator();
    while(colorKeyIterator.hasNext()){
      // Auto-Unboxing
      int colorKey = colorKeyIterator.next();
      System.out.println(colorKey + ": " + colorCodes.get(colorKey));
    }

    Collection<String> colorValues = colorCodes.values();
    for(String color: colorValues){
      System.out.println(color);
    }
  }
}
