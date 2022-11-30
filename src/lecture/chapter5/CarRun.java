package lecture.chapter5;

public class CarRun {

    public static void main(String[] args) {

        Car myCar = new Car("Fiat", "Rot", 156);
        Car yourCar = new Car("Mercedes", "Schwarz", 500);
        Car hisCar = new Car();

        /*
        myCar.brand = "Fiat";
        myCar.hp = 156;
        myCar.color = "Rot";

        yourCar.brand = "Mercedes";
        yourCar.hp = 500;
        yourCar.color = "Grau";
         */

        //myCar.color = "kack Braun";
        //myCar.hp = 5;
        //myCar.currentSpeedInKmh = -500;

        System.out.println("Mein Auto ist ein " + myCar.getBrand()
                                + " in der Farbe " + myCar.getColor()
                                + " mit " + myCar.getHp() + " PS");

        System.out.println("Sein Auto ist ein " + hisCar.getBrand()
                + " in der Farbe " + hisCar.getColor()
                + " mit " + hisCar.getHp() + " PS");

        System.out.println("Aktuelle Geschwindigkeit von meinem Auto: " + myCar.getCurrentSpeedInKmh() + " km/h");

        myCar.accelerate(-50);
        myCar.accelerate(5000);
        myCar.brake();

        System.out.println("Aktuelle Geschwindigkeit von meinem Auto: " + myCar.getCurrentSpeedInKmh() + " km/h");
        System.out.println("Aktuelle Geschwindigkeit von deinem Auto: " + yourCar.getCurrentSpeedInKmh() + " km/h");

    }
}
