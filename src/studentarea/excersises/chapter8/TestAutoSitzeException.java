package studentarea.excersises.chapter8;

/**
 * @author Jan Wichmann
 * @GitHub-Name janwichi
 * @version 1.0.0 (Finished)
 * @modified 11.05.2023
 * @exersice:
 * In Ihrem Unternehmen beziehen Sie Autositze. Für das Beziehen stehen Ihnen die
 * Materialien Leder und Stoff zur Verfügung. Den Stoff können Sie in jeder beliebigen
 * Farbe liefern. Leder jedoch ist nur in den Farben Schwarz und Weiß lieferbar.
 * Implementieren Sie eine Klasse AutoSitze gemäß der Vorgaben des UMLDiagramms. Der Konstruktor soll eine Fehlermeldung der von Ihnen zu
 * implementierenden Fehlerklasse FalscheParameter erzeugen, sobald er ungültige
 * Parameterkombinationen erhält. Der Meldungstext der Fehlerklasse soll die
 * fehlerhafte Parameterkombination ausgeben.
 * Testen Sie Ihre Klasse AutoSitze mit einem kleinen Testprogramm
 * TestAutoSitzeException. In Ihrem Testprogramm soll nach erfolgreichem Durchlauf
 * des Konstruktors eine Meldung ausgegeben werden, in welcher Farbe und in
 * welchem Material der Sitz bezogen wurde. Sollte während dem Durchlauf des
 * Konstruktors eine Ausnahme ausgelöst werden, geben Sie bitte in Ihrem
 * Testprogramm den Meldungstext der Ausnahme sowie einen kleinen Hinweis, dass
 * das Beziehen fehlgeschlagen ist, aus.
 */

public class TestAutoSitzeException {


    public static void main(String[] args) {
        testAutoSitze("Leder", "Schwarz");
        testAutoSitze("Leder", "Blau");
        testAutoSitze("Stoff", "Gelb");
    }
    private static void testAutoSitze(String material, String farbe) {
        try {
            AutoSitze autoSitze = new AutoSitze(material, farbe);
            System.out.println("Der Sitz wurde erfolgreich mit " + autoSitze.getMaterial() + " in der Farbe " + autoSitze.getFarbe() + " bezogen.");
        } catch (FalscheParameter e) {
            System.out.println("Fehler beim Beziehen des Sitzes: " + e.getMessage());
        }
    }
}
