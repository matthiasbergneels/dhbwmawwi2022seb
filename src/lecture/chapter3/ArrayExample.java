package lecture.chapter3;

public class ArrayExample {

    public static void main(String[] args) {

        int numberA, numberB, numberC, numberD;

        numberA = 10;

        int[] numbers = new int[10];

        numbers[0] = 42;
        numbers[1] = 84;
        // ..
        numbers[9] = 1024;

        System.out.println(numbers[1]);

        boolean[] truthOrFalse = new boolean[100];

        String[] words;

        words = new String[numberA];

        System.out.println(words);


        // Mehrdimensionale Arrays

        char[][] tictactoe = new char[3][3];

        tictactoe[1][1] = 'X';
        tictactoe[2][0] = 'O';


        String[][][] chapterText = new String[7][][];

        // Chapter 1
        chapterText[0] = new String[15][];

        // Chapter 1 - Sentence 1
        chapterText[0][0] = new String[5];

        chapterText[0][0][0] = "Hallo";
        chapterText[0][0][1] = "zur";
        chapterText[0][0][2] = "Java";
        chapterText[0][0][3] = "Vorlesung";
        chapterText[0][0][4] = "!";

        // Chapter 1 - Sentence 2
        chapterText[0][1] = new String[4];

        chapterText[0][1][0] = "Das";
        chapterText[0][1][1] = "ist";
        chapterText[0][1][2] = "kacke";
        chapterText[0][1][3] = ".";

        // ...

        // Array Literal

        final String[] ALLOWED_COLORS = {"ROT", "GRÜN", "BLAU", "SCHWARZ"};

        System.out.println(ALLOWED_COLORS[3]);

        int[][] numbers2D = {{1,2}, {3,4,5}, {6,7,8,9}};

        System.out.println(numbers2D[1][2]);


        System.out.println(numbers2D.length);
        System.out.println(numbers2D[2].length);




    }
}
