package studentarea.excersises.chapter8.exercise1;

import java.io.FileWriter;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) {

        String text;
        try (FileWriter file = new FileWriter("output.txt")) {
            text = "1\n";
            for (int i = 2; i <= 100; i++) {
                text += i;
                text += "\n";
            }
            file.write(text, 0, text.length());
            file.flush();
        } catch (IOException e) {
            System.out.println("Something went somewhere terribly wrong!");
        }

    }
}