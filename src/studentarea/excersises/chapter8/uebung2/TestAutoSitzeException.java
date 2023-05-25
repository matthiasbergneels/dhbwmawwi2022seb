package studentarea.excersises.chapter8.uebung2;

public class TestAutoSitzeException
{
    public static void main(String[] args)
    {
        try {
            AutoSitze sitze = new AutoSitze(false, "Rot");
        }
        catch (FalscheParameter e)
        {
            System.out.println(e.getMessage());
        }
    }
}
