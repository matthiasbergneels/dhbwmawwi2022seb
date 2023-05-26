package studentarea.excersises.chapter8;

public class ExecuteAutoSitze {
    public static void main(String[] args) {
        try{
            AutoSitze myAutoSitz = new AutoSitze(true, "schwarz");
            System.out.println("Der Sitz wurde erfolgreich mit " + (myAutoSitz.isLedersitze() ? "Leder" : "Stoff") + " in " + myAutoSitz.getFarbe() + " bezogen");
            new AutoSitze(true, "gelb");

        }catch (FalscheParameter e) {
            System.out.println("Es ist folgender Fehler aufgetreten:\n" + e.getMessage());
        }
    }
}
