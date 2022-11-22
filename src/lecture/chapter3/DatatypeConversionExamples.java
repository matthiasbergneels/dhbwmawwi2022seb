package lecture.chapter3;

public class DatatypeConversionExamples {

    public static void main(String[] args) {

        byte smallNumberA = 56;

        int biggerNumberB;

        // implizite Konvertierung --> klein nach groß
        // (eigentlich unproblematisch)
        biggerNumberB = smallNumberA;

        double preciseNumberC;
        preciseNumberC = biggerNumberB;


        // ABER:
        long biggestNumberD = 123456789;
        float preciseNumberE;

        System.out.println(biggestNumberD);
        preciseNumberE = biggestNumberD;
        System.out.println(preciseNumberE);


        // Explizite Konvertierung

        preciseNumberC = -129.8;

        biggerNumberB = (int)preciseNumberC;
        System.out.println(biggerNumberB);

        smallNumberA = (byte)preciseNumberC;
        System.out.println(smallNumberA);


    }
}
