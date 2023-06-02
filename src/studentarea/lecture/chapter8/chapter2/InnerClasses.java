package studentarea.lecture.chapter8.chapter2;

import lecture.excursion.innerclass.OuterClass;

public class InnerClasses {
    private static String staticText = "I am static";
    private String instanceText = "I am an instance info";

    private interface Printable{
        public void printTest();
    }

    public static class InnerTopLevelClass {
        public void printTest(){
            String message = staticText;
            System.out.println(this.getClass().getName()+ "Inner Top Level Class: " + message);
        }

    }

    public class InnerElementClass {
        public void printTest(){
            String message = staticText + " and " + instanceText;
            System.out.println(this.getClass().getName()+ "Inner Element Level Class: " + message);
        }
    }


    public void executePrintTextInnerElementClass() {
        InnerElementClass myInnerElementClass = new InnerElementClass();
        myInnerElementClass.printTest();
    }

    public void executePintTestInnerLocalClass() {
        class InnerLocalClass {
            public void printTest(){
                String message = staticText + " and " + instanceText;
                System.out.println(this.getClass().getName()+ "Inner Local Class: " + message);
            }

        }

        InnerLocalClass myInnerLocalClass = new InnerLocalClass();
        myInnerLocalClass.printTest();

    }

    public void executePrintTestAnonymousClass() {
        Printable anonymousClass = new Printable() {
            @Override
            public void printTest() {
                String message = staticText + " and " + instanceText;
                System.out.println(this.getClass().getName()+ "Inner Anonymous Class: " + message);
            }
            };

            anonymousClass.printTest();
        }


        public void executePrintTestLamda() {
            InnerClasses.Printable lamdaFuction = () -> {
                System.out.println("Ich mache was ich will");
            };
        }


    public static void main(String[] args) {
        InnerTopLevelClass myInnerTopLevelClass = new InnerTopLevelClass();
        myInnerTopLevelClass.printTest();

        InnerClasses myOuterClass = new InnerClasses();
        myOuterClass.executePrintTextInnerElementClass();

        myOuterClass.executePintTestInnerLocalClass();

        myOuterClass.executePrintTestAnonymousClass();

        //myOuterClass.executePrintTestLamda();
        InnerClasses.Printable lamdaFuction = () -> {
            System.out.println("Ich mache, was ich will");

        };

        lamdaFuction.printTest();










    }

}
