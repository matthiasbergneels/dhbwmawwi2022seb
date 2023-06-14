## 1. Übung
Das folgende Programm soll die Zahlen von 1 bis 100 in eine Textdatei mit dem Namen ausgabe.txt schreiben.
Leider kann das Programm in dieser Form nicht ausgeführt werden.
Was ist der Grund dafür und wie können Sie es korrigieren?
(Anmerkung: Auch wenn der Input- & Output-Stream noch nicht behandelt wurde, können Sie die Frage schon jetzt beantworten.)

## Code
```Java
import java.io.FileWriter;

public class Uebung1 {

    public static void main(String[] args) {
        FileWriter datei;
        String text;

        datei = new FileWriter("ausgabe.txt");
        text = "1\n";

        for(int i = 2; i <=100; i++) {
            text += i;
            text += "\n";
        }

        datei.write(text, 0, text.length());
        datei.flush(); 
    }
}
```

## Antwort
Es fehlt das Try-Catch