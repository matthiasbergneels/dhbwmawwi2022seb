package lecture.chapter4;

public class IfExamples {

    public static void main(String[] args) {

        boolean trafficLightisRed = false;

        if(trafficLightisRed) {
            System.out.println("Stehen bleiben");
            System.out.println("Warten bis es grün wird");
        }else {
            System.out.println("Schnell drüber fahren");
        }


        System.out.println("Geschwindigkeits-Check:");
        int speed = 49;
        boolean inVillage = false;

        if(speed > 70 && speed <= 100){
            System.out.println("Führerschein weg");
        } else if(speed > 0 && speed <= 50) {
            System.out.println("Alles ok");
        } else if(speed > 50 && speed <= 70){
            System.out.println("Zu schnell");
        }

        System.out.println("Ende des Programms");


    }
}
