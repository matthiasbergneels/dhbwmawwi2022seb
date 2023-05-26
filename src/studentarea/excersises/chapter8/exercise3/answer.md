# Übung 3

In dem Quellcode wird im zweiten `try-catch`-Block zuerst die Standard `Exception`
gefangen und erst danach die spezialisierte `TankLeer` Ausnahme behandelt.
Die Reihenfolge der `catch`-Blöcke müsste wie folgt geändert werden,
damit die spezialisierte Ausnahme spezifisch behandelt werden kann und alle anderen generisch:
```java
...
try {
    bmw.fahren();
} catch (TankLeer e) {
    System.out.println(e.getMessage());
    System.out.println(e.toString());
    e.printStackTrace();
} catch (Exception e) {
    e.printStackTrace();
}
...
```