package studentarea.excersises.chapter8;

public class AutoSitze {
    private String material;
    private String farbe;

    public AutoSitze(String material, String farbe) throws FalscheParameter {
        if (material.equalsIgnoreCase("Leder") && !(farbe.equalsIgnoreCase("Schwarz") || farbe.equalsIgnoreCase("Weiß"))) {
            throw new FalscheParameter("Leder ist nur in Schwarz und Weiß lieferbar.");
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
