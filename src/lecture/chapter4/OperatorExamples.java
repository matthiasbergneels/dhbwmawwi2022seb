package lecture.chapter4;

public class OperatorExamples {

    public static void main(String[] args) {

        int numberA = 5;
        int numberB = 10;

        int result;

        result = numberA++ * numberB;

        System.out.println(numberA);

        System.out.println(numberA);

        ++numberA; // --> numberA = numberA + 1;

        System.out.println(numberA);


        // Zuweisungoperatoren

        // numberA = numberA + 5;
        numberA += 5;


        // ?-Operator

        boolean isTired = false;

        String text = isTired ? "Ab ins Bett" : "Let's Party";

        System.out.println(text);

        System.out.println((numberA > numberB) ? numberA : numberB);

        String textResult = text + " hard";

        System.out.println(numberB + numberA + textResult + (numberA + numberB));
    }
}
