package studentarea.excersises.chapter8;

public class FalscherParameterException extends Exception {
  public FalscherParameterException(boolean isbezug, String color) {
    super("Die Kombi Bezug:" + isbezug + " und die Farbe: " + color + " funktioniert nicht!");
  }
}

