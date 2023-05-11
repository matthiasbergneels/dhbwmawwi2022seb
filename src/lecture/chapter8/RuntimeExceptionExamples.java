package lecture.chapter8;

public class RuntimeExceptionExamples {

    public static void main(String[] args) {

        String myText = null;

        System.out.println(myText.length());

        try {
            System.out.println(args[0]);

        }catch(IndexOutOfBoundsException e){
            System.out.println("Es wurden keine Argumente mitgegeben!");
        }

        // alternative

        if(args.length >= 1){
            System.out.println(args[0]);

        }else{
            System.out.println("Es wurden keine Argumente mitgegeben!");
        }

        for(int i = 0; i < 10; i++){
            System.out.println(args[i]);
        }

    }
}
