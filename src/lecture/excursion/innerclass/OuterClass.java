package lecture.excursion.innerclass;

public class OuterClass {

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


    }
}
