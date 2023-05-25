package studentarea.excersises.chapter8;

public class TestAutoSitzeException {
    public static void main(String[] args) {
        try {
            new AutoSitze(true, "Rot");
        } catch (FalscheParameter e) {
            System.err.println(e.getMessage());
            System.err.println("Das Beziehen ist fehlgeschlagen.");
        }
    }
}
