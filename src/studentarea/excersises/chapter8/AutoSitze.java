package studentarea.excersises.chapter8;

public class AutoSitze {

  private final String material;
  private final String farbe;

  public AutoSitze(String material, String farbe) throws FalscheParameter {
    if (material.equalsIgnoreCase("Leder") && !(farbe.equalsIgnoreCase("Schwarz") || farbe.equalsIgnoreCase("Weiß"))) {
      throw new FalscheParameter(farbe, material.equalsIgnoreCase("Leder"));
    }

    this.material = material;
    this.farbe = farbe;
  }

  public String getMaterial() {
    return material;
  }

  public String getFarbe() {
    return farbe;
  }

}
