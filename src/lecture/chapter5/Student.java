package lecture.chapter5;

public class Student {

    private int id;

    public Student(int id) {
        this.id = id;
    }

    public void drink(float amount){
        System.out.println("Der Student trinkt " + amount + " l Flüssigkeit");
    }

    public void drink(float amount, double alcoholInPercentage){
        drink(amount);
        System.out.println("und wird " + (alcoholInPercentage > 20 ? "schnell" : "langsam" ) + " betrunken");
    }

    public void drink(float amount, boolean isPoisened){
        drink(amount);
        System.out.println("und stirbt.");
    }

    public void drink(double coffeinInMg, float amount){
        drink(amount);
        System.out.println("und wird " + (coffeinInMg > 50 ? "schnell" : "langsam" ) + " wach");
    }


    public void drink(Car myCar){       // << Call by Reference auf dem Parameter

    }

}
