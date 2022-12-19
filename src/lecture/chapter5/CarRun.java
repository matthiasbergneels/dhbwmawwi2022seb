package lecture.chapter5;

public class CarRun {

    public static void main(String[] args) {

        System.out.println("Anzahl Autos: " + Car.getCarCount());

        Car myCar = new Car(CarBrand.FIAT, Car.ALLOWED_COLOR_RED, 156);
        Car yourCar = new Car(CarBrand.MERCEDES, Car.ALLOWED_COLOR_BLACK, 500);
        Car hisCar = new Car();
        Car herCar = new Car();

        new Car();
        new Car();
        new Car();

        Car[] garage = {new Car(), new Car(), new Car(), new Car()};

        System.out.println("Anzahl Autos: " + Car.getCarCount());

        System.out.println("Preisklasse für myCar ("+myCar.brand+"): " + myCar.getPriceClass());
        System.out.println("Preisklasse für yourCar ("+yourCar.brand+"): " + yourCar.getPriceClass());

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

        System.out.println(myCar);
        System.out.println(yourCar);
        System.out.println(hisCar);

        Car schnurziPupsCar = myCar;

        System.out.println(schnurziPupsCar);

        System.out.println("Anzahl Autos: " + Car.getCarCount());

        for( CarBrand currentBrand : CarBrand.values()){
            System.out.println(currentBrand);
        }

        myCar = null;
        schnurziPupsCar = null;


        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Da ist was scheif gegangen beim warten");
        }

        System.out.println("Anzahl Autos: " + Car.getCarCount());

        System.out.println(CarBrand.TESLA);
        System.out.println(CarBrand.MERCEDES);
    }
}
