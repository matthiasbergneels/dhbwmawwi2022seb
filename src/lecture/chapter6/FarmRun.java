package lecture.chapter6;

public class FarmRun {

    public static void main(String[] args) {

        Animal myAnimal = new Animal(15f, 50f, "Tierchen");
        Dog myDog = new Dog(68f, 70f, "Bello", "Dogge");
        Bird myBird = new Bird(5f, 8f, "Tweety", true);

        // narrowing Cast --> Sicht auf das Objekt wird eingeschränkt
        Animal yourAnimal = new Bird(5f, 8f, "Fiepsi", true);

        yourAnimal.breath();
        yourAnimal.eat();
        yourAnimal.move();
        //yourAnimal.tweet();

        // widening Cast --> Sicht auf das Objekt erweitern
        Bird yourBird = (Bird)yourAnimal;

        yourBird.breath();
        yourBird.eat();
        yourBird.move();
        yourBird.tweet();


        myAnimal.breath();
        myAnimal.eat();
        myAnimal.move();
        //myAnimal.bark();

        myDog.breath();
        myDog.eat();
        myDog.move();
        myDog.bark();

        myBird.breath();
        myBird.eat();
        myBird.move();
        myBird.tweet();


        Animal[] shelter = new Animal[5];

        shelter[0] = myDog;
        shelter[1] = myAnimal;
        shelter[2] = myBird;
        shelter[3] = yourBird;

        System.out.println("Daily keep animals alive routine:");
        System.out.println("===============================================");
        for(Animal currentAnimal : shelter){
            if(currentAnimal == null){
                continue;
            }
            // Daily keep animals alive routine
            currentAnimal.breath();
            currentAnimal.eat();
            currentAnimal.move();

            if(currentAnimal instanceof Dog) {
                // widening Cast
                Dog currentDog = (Dog) currentAnimal;
                currentDog.bark();
            } else {
                System.out.println("Kein Hund!!");
            }
        }
    }
}
