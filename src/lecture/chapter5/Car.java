package lecture.chapter5;

public class Car {

    private String color;
    private int hp;             // --> horsePower
    public String brand;
    private int currentSpeedInKmh;

    public static final String ALLOWED_COLOR_RED = "rot";
    public static final String ALLOWED_COLOR_GREY = "grau";
    public static final String ALLOWED_COLOR_BLACK = "schwarz";
    public static final String ALLOWED_COLOR_WHITE = "weiss";

    Car(){
        this("Tesla", "weiß", 380);
    }

    Car(String brand, String color, int hp){
        this.setBrand(brand);
        this.setColor(color);
        this.setHp(hp);

        currentSpeedInKmh = 0;
    }

    public void accelerate(int accelerationDeltaInKmh){
        if(accelerationDeltaInKmh > 0 && accelerationDeltaInKmh < 50){
            currentSpeedInKmh += accelerationDeltaInKmh;
        }
        System.out.println("Der " + brand + " fährt " + currentSpeedInKmh + " kmh");
    }

    public void brake(){
        currentSpeedInKmh = currentSpeedInKmh - 10;
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

    public String getBrand() {
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

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
