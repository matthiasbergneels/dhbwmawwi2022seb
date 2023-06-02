package studentarea.excersises.chapter8;

public class TestAutoSitzeException {

    public static void main(String[] args) {
        generateSeat(true, "Schwarz");

    }

    public static void generateSeat(Boolean isLedersitz, String color){
        try{
            AutoSitze neuerSitz = new AutoSitze(isLedersitz, color);
            System.out.println("Neuer Sitz aus " + (neuerSitz.isLedersitze()? "Leder":"Stoff") + " bezogen. " +
                    "\nFarbe: " + neuerSitz.getFarbe());

        } catch (FalscheParameter e) {

            System.out.println(e.getMessage());

        }
    }


}
