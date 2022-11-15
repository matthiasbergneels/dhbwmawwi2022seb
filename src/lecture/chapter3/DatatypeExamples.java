package lecture.chapter3;

public class DatatypeExamples {

    static int counter;
    static char staticSign;

    public static void main(String[] args) {

        System.out.println(counter);

        // Variablen Deklaration
        int numberA;

        numberA = 10;

        System.out.println(numberA);

        // Variablen Deklaration + Initialisierung
        double numberB = 5.0;

        // Mehrfacvhe Variablen Deklaration von einem Typ
        char firstSign, secondSign = 'A', thirdSign;

        boolean isTired = true; // false;


        final double PI;

        PI = 3.14;

        System.out.println(PI);

        // PI = 5; --> nicht möglich bei Konstanten


        // Ganzzahlen Literale

        // Dezimal-Literal
        numberA = 10;               // --> Wert: 10
        numberA = 10_000_000;       // --> Wert: 10000000

        // Oktal-Literal
        numberA = 010;              // --> Wert: 8
        System.out.println(numberA);

        // Hexadezimal-Literal
        numberA = 0x10;              // --> Wert: 16
        System.out.println(numberA);

        // Binär-Literal
        numberA = 0b10;              // --> Wert: 2
        System.out.println(numberA);

        int redColorValue = 0xFF;
        int colorValue = 0x00FF00;
        System.out.println(redColorValue);
        System.out.println(colorValue);


        // Gleitkomma-Literale
        numberB = 5.0;
        numberB = .5;
        numberB = .5E-2;
        numberB = .5E-2D;

        System.out.println(numberB);

        float numberC;

        numberC = 5.0f;
        numberC = 5.0e2f;


        // Char-Literal
        firstSign = 'A';

        System.out.println(firstSign);
        System.out.println(staticSign);

        numberA = staticSign;
        numberA = firstSign;

        firstSign = (char)(firstSign + 1);

        System.out.println(numberA);
        System.out.println(firstSign);

        firstSign = '\u2764';
        System.out.println(firstSign);

        // Zeichenkettenliteral
        String longerText = "Hier stehen \"mehr\" als\nein\t Zeichen! \u2764";

        System.out.println(longerText);

        String htmlText = """
        <html>
                    <head>
                    </head>
                    <body>
                        <h1>"Head\nline"</h1>
                    </body>
                </html>
                """;

        System.out.println(htmlText);
    }


}
