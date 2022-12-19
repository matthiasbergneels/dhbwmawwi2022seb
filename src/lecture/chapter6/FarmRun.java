package lecture.chapter6;

import lecture.chapter5.Car;

public class FarmRun {

    public static void main(String[] args) {

        // Animal myAnimal = new Animal(15f, 50f, "Tierchen");              // --> abstract: Klasse kann nicht instanziiert werden (kann keine eigenen Objekte haben)
        Animal myAnimal = new Dog(68f, 70f, "Hasso", "Schäferhund");
        Dog myDog = new Dog(68f, 70f, "Bello", "Dogge");
        Bird myBird = new Bird(5f, 8f, "Tweety", true);

        // Implementierung der Abstrakten-Klasse Animal als anonyme Klasse
        Animal anonymousAnimal = new Animal(68f, 70f, "NobodyKnows") {
            @Override
            public void breath() {
                System.out.println("Das anonyme Tier " + getDescription() + " atmet! *geheimgehim*");
            }
        };

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

        // Narrowing Casts
        shelter[0] = myDog;
        shelter[1] = myAnimal;
        shelter[2] = myBird;
        shelter[3] = yourBird;
        shelter[4] = anonymousAnimal;

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
            // currentAnimal.eat(1.5f); --> Überladene Methode aus Dog

            if(currentAnimal instanceof Dog) {
                // widening Cast
                Dog currentDog = (Dog) currentAnimal;
                currentDog.bark();
                currentDog.eat(1.5f);
            } else {
                System.out.println("Kein Hund!!");
            }

            // narrowing Cast
            Object currentObject = currentAnimal;

            System.out.println(currentObject.hashCode());
            System.out.println(currentObject);

            System.out.println("Aktuelles Objekt passt zu: ");
            System.out.println("Klasse von aktuellem Objekt hinter currentObject: " + currentObject.getClass().getName());
            System.out.println("currentObject instanceOf Dog: " + (currentObject instanceof Dog));
            System.out.println("currentObject instanceOf Bird: " + (currentObject instanceof Bird));
            System.out.println("currentObject instanceOf Animal: " + (currentObject instanceof Animal));
            System.out.println("currentObject instanceOf Object: " + (currentObject instanceof Object));
            //System.out.println("instanceOf Car: " + (currentAnimal instanceof Car));


        }
    }
}
