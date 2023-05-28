package studentarea.excersises.chapter9;

public class TestVergleichKunde {
    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Mustermann", "Klaus", 4711);
        Kunde kunde2 = new Kunde("Mustermann", "Klaus", 4711);

        System.out.println(kunde1.equals(kunde2) ? "Die Kunden sind gleich" : "Die Kunden sind nicht gleich");
    }
}
