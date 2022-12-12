package lecture.chapter6;

public class Dog extends Animal{

    private String breed;

    public Dog(float weight, float size, String description, String breed){
        super(weight, size, description);
        setBreed(breed);
    }


    public void bark(){
        System.out.println("Der Hund " + getDescription() + " bellt! *wuff*");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
