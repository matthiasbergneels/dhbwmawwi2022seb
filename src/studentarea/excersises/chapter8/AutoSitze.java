package studentarea.excersises.chapter8;

import java.util.Arrays;
import java.util.List;

public class AutoSitze {

    private static final List<String> possibleLeatherColors = Arrays.asList("Schwarz", "Weiß");
    private final boolean ledersitze;
    private final String farbe;

    AutoSitze(boolean bezug, String color) {

        if (bezug && !possibleLeatherColors.contains(color))
            throw new FalscheParameter(color);

        this.ledersitze = bezug;
        this.farbe = color;
    }

    public String getFarbe() {
        return this.farbe;
    }

    public boolean isLedersitze() {
        return this.ledersitze;
    }
}
