package studentarea.excersises.chapter8.Aufgabe2;

public class AutoSitze {
  private final boolean isbezug;
  private final String color;

  public AutoSitze(boolean isbezug, String color) throws FalscherParameterException {

    if (isbezug && !(color.equals("Schwarz") || color.equals("Weiß"))) {
      throw new FalscherParameterException(isbezug, color);
    }

    this.isbezug = isbezug;
    this.color = color;

  }

  public boolean isLederBezug() {
    return isbezug;
  }

  public String getColor() {
    return color;
  }
}
