package lecture.chapter4;

public class LoopExample {

    public static void main(String[] args) {


        System.out.println("Kopfgesteuerteschleife - while");
        int count = 0;
        while (count < 10){
            System.out.println(count++);
        }

        System.out.println("Fußgesteuerteschleife - do-while");
        count = 0;
        do{
            System.out.println(count++);
        }while(count < 10);

        System.out.println("Zählerschleife - for");
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for(count = 0; count < 10; count+=2){
            System.out.println(count);
        }

        System.out.println("Zählerschleife - for (Timmmmmmmyyyyyyy)");
        count = 0;
        for(;;){
            System.out.println(count++);
            if(count >= 10){
                break;
            }
        }

        System.out.println("Iterativer Zugriff auf Arrays:");
        String[] words = {"Hallo", "hier", "steht", "ein", "Text"};
    }
}
