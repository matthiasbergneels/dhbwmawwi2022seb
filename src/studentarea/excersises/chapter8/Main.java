package studentarea.excersises.chapter8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String text;
        try (FileWriter datei = new FileWriter("ausgabe.txt")) {
            text = "1\n";
            for (int i = 2; i <= 100; i++) {
                text += i;
                text += "\n";
            }
            datei.write(text, 0, text.length());
            datei.flush();
        }
    }
}