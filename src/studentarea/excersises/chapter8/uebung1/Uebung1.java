package studentarea.excersises.chapter8.uebung1;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung1
{
    public static void main(String[] args)
    {

        FileWriter datei;

        String text;

        try {

            datei = new FileWriter("ausgabe.txt");
            text = "1\n";

            for (int i = 2; i <= 100; i++) {
                text += i;
                text += "\n";
            }

            datei.write(text, 0, text.length());
            datei.flush();

        }
        catch (IOException e)
        {
            System.out.println("Das Programm konnte nicht ausgeführt werden");
        }

    }
}