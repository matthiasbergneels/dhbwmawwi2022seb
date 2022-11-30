package lecture.chapter3;

public class BadBoyString {

    public static void main(String[] args) {

        String text1 = "Hallo";
        String text2 = "Hallo";
        String text3 = new String();

        text2 = text2.toUpperCase();

        if(text1 == text2){
            System.out.println("text1 == text2");
        }else{
            System.out.println("text1 != text2");
        }

        if(text1 == text3){
            System.out.println("text1 == text3");
        }else{
            System.out.println("text1 != text3");
        }

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);

        if(text1.equals(text2)){
            System.out.println(text1 + " ist gleich " + text2);
        }else{
            System.out.println(text1 + " ist ungleich " + text2);
        }

        if(text1.equalsIgnoreCase(text2)){
            System.out.println(text1 + " ist gleich " + text2);
        }else{
            System.out.println(text1 + " ist ungleich " + text2);
        }

        if(text1.equals(text3)){
            System.out.println(text1 + " ist gleich " + text3);
        }else{
            System.out.println(text1 + " ist ungleich " + text3);
        }

    }


}
