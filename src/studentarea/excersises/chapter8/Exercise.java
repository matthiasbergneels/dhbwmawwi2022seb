package studentarea.excersises.chapter8;

public class Exercise {
    public static void main(String[] args) {
        //Arbitrary colors for test
        String colors[] = { "White", "Black", "Yellow" };

        try {
            for(String color : colors) {
                AutoSitze seat = new AutoSitze(color, true);
            }
        } catch (TestAutoSitzeException e) {
            System.out.println(e.getMessage());
        }

    }
}
