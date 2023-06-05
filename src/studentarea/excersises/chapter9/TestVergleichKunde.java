package studentarea.excersises.chapter9;

public class TestVergleichKunde {

    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Jordan", "Michael", 23);
        Kunde kunde2 = new Kunde("Jordan", "Michael", 23);

        System.out.println(kunde1.equals(kunde2));
    }
}
