package lecture.chapter4;

public class LoopExample {

    public static void main(String[] args) {


        double runningDistanceInKm = 0.0;
        double runningDurationInMin = 0.0;

        while(runningDistanceInKm < 10.0 && runningDurationInMin < 60.0){
            // Werte von Sensor auslesen
            runningDistanceInKm += 1;
            runningDurationInMin += 6.25;

            System.out.println("Aktuelle Distanz: " + runningDistanceInKm);
            System.out.println("Aktuelle Zeit: " + runningDurationInMin);
        }

        System.out.println("Lauf ist beendet!");
        System.out.println("Werte: ");
        System.out.println("Aktuelle Distanz: " + runningDistanceInKm);
        System.out.println("Aktuelle Zeit: " + runningDurationInMin);


        System.out.println("Kopfgesteuerteschleife - while");
        int count = 0;
        while (count < 10){

            System.out.println(count++);
        }

        System.out.println("Fußgesteuerteschleife - do-while");
        count = 0;
        do{
            System.out.println(count++);
        }while(count < 10);

        System.out.println("Zählerschleife - for");
        for(int i = 0; i < 10; i++){
            System.out.print("Nächste Zahl - ");
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        for(count = 0; count < 10; count+=2){
            System.out.println(count);
        }

        System.out.println("Zählerschleife - for (Timmmmmmmyyyyyyy)");
        count = 0;
        for(;;){
            System.out.println(count++);
            if(count >= 10){
                break;
            }
        }

        System.out.println("Iterativer Zugriff auf Arrays:");
        String[] words = {"Hallo", "hier", "steht", "ein", "Text", "mich", "siehst", "nicht"};

        System.out.println("Arrayzugriff über for-Zählerschleife");
        for(int i = 0; i < words.length; i++){
            if(words[i].equals("Hallo")){
                words[i] = "Guten Morgen";
            }
            System.out.println(words[i]);


        }

        System.out.println("Arrayzugriff über for-Each");
        for(String word : words){
            if(word.equals("Guten Morgen")){
                word = "Hallo";
            }
            System.out.println(word);

            if(word.equals("Text")){
                break;      // --> Schleife wird beendet
            }
        }

        System.out.println("Arrayzugriff über for-Each - Second Run");
        for(String word : words){
            System.out.println(word);
        }

        char[] word = words[0].toCharArray();

        for(char currentLetter : word){
            System.out.println(currentLetter);
        }
    }
}
