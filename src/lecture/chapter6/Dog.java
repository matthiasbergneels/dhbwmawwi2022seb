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

    @Override
    public void eat(){               // --> Überschreibt die eat() Methode aus Animal
        System.out.println("Der Hund " + getDescription() + " frisst Fleisch");
    }

    // Überladen der eat() Methode aus Animal / Dog
    public void eat(float meatAmount){
        this.eat();
        System.out.println("und zwar " + meatAmount + " kg");
    }

    @Override
    public void breath() {
        System.out.println("Der Hund " + getDescription() + " atmet! *hechelhechel*");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rasse: " + getBreed();
    }
}
