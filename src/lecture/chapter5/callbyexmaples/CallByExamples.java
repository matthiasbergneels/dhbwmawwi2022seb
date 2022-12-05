package lecture.chapter5.callbyexmaples;

public class CallByExamples {

    public static void main(String[] args) {

        // Call by Value --> primitive Datentypen

        int numberA = 20;
        int numberB;

        numberB = numberA;      // << Call by Value

        numberA = numberA + 50;

        System.out.println("Aktueller Wert numberA: " + numberA);
        System.out.println("Aktueller Wert numberB: " + numberB);

        // Call by Reference

        Person herrBergNeels = new Person();

        Person papa = herrBergNeels;        // << Call by Reference
        Person matthias = papa;             // << Call by Reference
        Person schnurziPups = matthias;     // << Call by Reference

        Person profDrHoley = new Person();

        System.out.println("Herr Berg-Neels blaues Auge? " + herrBergNeels.hatBlauesAuge());
        System.out.println("Herr Prof. Dr. Holey blaues Auge? " + profDrHoley.hatBlauesAuge());

        System.out.println("Schnurzi Pups hat die Spülmaschine nicht ausgeräumt --> fängt sich ein!");
        schnurziPups.schlagen();

        System.out.println("Herr Berg-Neels blaues Auge? " + herrBergNeels.hatBlauesAuge());
        System.out.println("Herr Prof. Dr. Holey blaues Auge? " + profDrHoley.hatBlauesAuge());

    }
}
