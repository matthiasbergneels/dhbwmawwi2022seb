package lecture.chapter5.callbyexmaples;

public class Person {

    private boolean hatBlauesAuge;

    public Person(){
        hatBlauesAuge = false;
    }

    public boolean hatBlauesAuge(){
        return hatBlauesAuge;
    }

    public void schlagen(){
        hatBlauesAuge = true;
    }
}
