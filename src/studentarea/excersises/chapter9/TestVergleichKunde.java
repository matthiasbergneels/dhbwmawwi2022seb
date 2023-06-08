package studentarea.excersises.chapter9;

public class TestVergleichKunde {
    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("Tobias" ,"Müller", 1111);
        Kunde kunde2 = kunde1;
        Kunde kunde3 = new Kunde("Olaf", "Merz", 1112);

        System.out.println(kunde1.equals(kunde2));
        System.out.println(kunde1.equals(kunde3));
    }
}
