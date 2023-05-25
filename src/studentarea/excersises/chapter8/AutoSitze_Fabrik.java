package Autositz;

public class AutoSitze_Fabrik {
    public static void main(String[] args){

        try {
            AutoSitze autosizt1 = new AutoSitze(true, ErlaubteFarben.SCHWARZ);
            AutoSitze autosizt2 = new AutoSitze(false, ErlaubteFarben.GRÜN);
            AutoSitze autositz3 = new AutoSitze(true, ErlaubteFarben.GELB);
        } catch (TestAutoSitzeException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Genug Sitze gebaut für heute!");
        }







    }
}
