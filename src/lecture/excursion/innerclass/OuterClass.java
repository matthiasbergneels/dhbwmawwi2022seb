package lecture.excursion.innerclass;

public class OuterClass {

    public static interface Printable{
        void printMessage(String message);
    }

    private static String staticInfo = "Äußere Klasse statische Info";
    private String instanceInfo = "Äußere Klassse Instanz Info ";

    // Definition der inneren Klassen
    public static class InnerTopLevelClass{
        public void printMessage(String message){
            System.out.println("Nachricht von " + this.getClass() + ": " + message);
            System.out.println("Static Info: " + staticInfo);
            //System.out.println("Instance Info: " + instanceInfo);
        }
    }

    class InnerElementClass{
        public void printMessage(String message){
            System.out.println("Nachricht von " + this.getClass() + ": " + message);
            System.out.println("Static Info: " + staticInfo);
            System.out.println("Instance Info: " + instanceInfo);
        }
    }


    public OuterClass(int id){
        instanceInfo = instanceInfo + id;
    }

    public void printMessage(String message){
        System.out.println("Nachricht von " + this.getClass() + ": " + message);
        System.out.println("Static Info: " + staticInfo);
        System.out.println("Instance Info: " + instanceInfo);

        // Häufige Nutzung von inneren Element-Klassen
        //InnerElementClass myElementClassObject = new InnerElementClass();
    }

    public void printMessageFromInnerLocalClass(String message){
        class InnerLocalClass{
            public void printMessage(String message){
                System.out.println("Nachricht von " + this.getClass() + ": " + message);
                System.out.println("Static Info: " + staticInfo);
                System.out.println("Instance Info: " + instanceInfo);
            }
        }

        class InnerSecondLocalClass{
            public void printMessage(String message){
                System.out.println("Nachricht von " + this.getClass() + ": " + message);
                System.out.println("Static Info: " + staticInfo);
                System.out.println("Instance Info: " + instanceInfo);
            }
        }

        InnerLocalClass myInnerLocalClassObject = new InnerLocalClass();
        myInnerLocalClassObject.printMessage(message);
    }

    public void printSecondMessageFromInnerLocalClass(String message){
        class InnerLocalClass{
            public void printMessage(String message){
                System.out.println("Nachricht von " + this.getClass() + ": " + message);
                System.out.println("Static Info: " + staticInfo);
                System.out.println("Instance Info: " + instanceInfo);
            }
        }

        InnerLocalClass myInnerLocalClassObject = new InnerLocalClass();
        myInnerLocalClassObject.printMessage(message);
    }

    public void printFromAnonymousClass(String message){

        OuterClass.Printable myAnonymousClassObject = new Printable() {
            private int counter = 0;

            // Geschachtelte anonyme Klasse in einer Anonymen Klasse
            OuterClass.Printable printableObject = new Printable() {
                @Override
                public void printMessage(String message){
                    counter++;
                    System.out.println("Nachricht von " + this.getClass() + ": " + message);
                    System.out.println("Static Info: " + staticInfo);
                    System.out.println("Instance Info: " + instanceInfo);
                    System.out.println("Methoden-Aufrufe: " + counter);
                }
            };
            @Override
            public void printMessage(String message){
                counter++;
                System.out.println("Nachricht von " + this.getClass() + ": " + message);
                System.out.println("Static Info: " + staticInfo);
                System.out.println("Instance Info: " + instanceInfo);
                System.out.println("Methoden-Aufrufe: " + counter);
                printableObject.printMessage(message);
            }

            public int getCounter(){
                return counter;
            }
        };

        myAnonymousClassObject.printMessage(message);
    }

    public void printWithLambdaFunction(String messageToLambdaFunction){
        Printable myLambdaFunction = message -> {
            System.out.println("Nachricht von " + this.getClass() + ": " + message);
            System.out.println("Static Info: " + staticInfo);
            System.out.println("Instance Info: " + instanceInfo);
        };

        myLambdaFunction.printMessage(messageToLambdaFunction);
    }


    public static void main(String[] args) {
        String message = "Hello from the inner World";

        System.out.println("Ausgabe über äußere Klasse 4711:");
        System.out.println("================================");
        OuterClass myOuterClass = new OuterClass(4711);
        myOuterClass.printMessage(message);

        System.out.println("Ausgabe über äußere Klasse 1234:");
        System.out.println("================================");
        OuterClass mySecondOuterClass = new OuterClass(1234);
        mySecondOuterClass.printMessage(message);

        System.out.println("Ausgabe über innere Top-Level-Klasse:");
        System.out.println("=====================================");
        OuterClass.InnerTopLevelClass myInnerTopLevelClassObject = new OuterClass.InnerTopLevelClass();
        myInnerTopLevelClassObject.printMessage(message);

        System.out.println("Ausgabe über innere Element-Klasse 4711:");
        System.out.println("========================================");
        OuterClass.InnerElementClass myInnerElementClassObject = myOuterClass.new InnerElementClass();
        myInnerElementClassObject.printMessage(message);

        System.out.println("Ausgabe über innere Element-Klasse 1234:");
        System.out.println("========================================");
        OuterClass.InnerElementClass myInnerElementClassObjectSecond = mySecondOuterClass.new InnerElementClass();
        myInnerElementClassObjectSecond.printMessage(message);


        System.out.println("Ausgabe über innere lokale Klasse 4711:");
        System.out.println("========================================");
        myOuterClass.printMessageFromInnerLocalClass(message);

        System.out.println("Ausgabe über innere lokale Klasse 4711:");
        System.out.println("========================================");
        myOuterClass.printSecondMessageFromInnerLocalClass(message);

        System.out.println("Ausgabe über innere anonyme Klasse 4711:");
        System.out.println("========================================");
        myOuterClass.printFromAnonymousClass(message);

        System.out.println("Ausgabe über Lambda-Funktion 4711:");
        System.out.println("========================================");
        myOuterClass.printWithLambdaFunction(message);
    }
}
