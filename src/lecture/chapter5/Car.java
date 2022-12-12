package lecture.chapter5;

public class Car {

    // Instanz Attribute
    private String color;
    private int hp;             // --> horsePower
    public final CarBrand brand;
    private int currentSpeedInKmh;

    // Klassen Attribute
    private static int carCount;

    public static final String ALLOWED_COLOR_RED = "rot";
    public static final String ALLOWED_COLOR_GREY = "grau";
    public static final String ALLOWED_COLOR_BLACK = "schwarz";
    public static final String ALLOWED_COLOR_WHITE = "weiss";

    // Klassen Konstruktor
    static {
        carCount = 5;
    }

    // Instanz Konstruktoren
    public Car(){
        this(CarBrand.TESLA, "weiß", 380);
    }

    public Car(CarBrand brand, String color, int hp){
        this.brand = brand;
        this.setColor(color);
        this.setHp(hp);

        currentSpeedInKmh = 0;

        carCount++;
    }

    // Instanz Methoden
    public void accelerate(int accelerationDeltaInKmh){
        if(accelerationDeltaInKmh > 0 && accelerationDeltaInKmh < 50){
            currentSpeedInKmh += accelerationDeltaInKmh;
        }
        System.out.println("Der " + brand + " fährt " + currentSpeedInKmh + " kmh");
    }

    public void brake(){
        int speedDeltaInKmh = 10;

        currentSpeedInKmh = currentSpeedInKmh - speedDeltaInKmh;
        if(currentSpeedInKmh < 0){
            currentSpeedInKmh = 0;
        }
    }

    public void fullBrake(){
        currentSpeedInKmh = 0;
    }

    public int getHp(){
        return this.hp;
    }

    public String getColor(){
        return this.color;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public int getCurrentSpeedInKmh() {
        return currentSpeedInKmh;
    }

    public void setColor(String color){
        if(color.equalsIgnoreCase(ALLOWED_COLOR_RED)
            || color.equalsIgnoreCase(ALLOWED_COLOR_BLACK)
            || color.equalsIgnoreCase(ALLOWED_COLOR_GREY)
            || color.equalsIgnoreCase(ALLOWED_COLOR_WHITE)){
            this.color = color;
        } else {
            this.color = ALLOWED_COLOR_GREY;
        }
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public static int getCarCount(){
        return carCount;
    }

    public String getPriceClass(){
        return brand.getPriceClass();
    }

    /*
    public void setBrand(BRANDS brand) {
        this.brand = brand;
    }
     */

    // Klassen Methode

    protected void finalize(){
        carCount--;
        System.out.println("Das Auto der Marke " + this.brand + " (Farbe: " + this.color + ") wurde verschrottet");
    }
}
