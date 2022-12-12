package lecture.chapter6;

public class Bird extends Animal{

    private boolean canFly;

    public Bird(float weight, float size, String description, boolean canFly) {
        super(weight, size, description);
        setCanFly(canFly);
    }

    public void tweet(){
        System.out.println("Der Vogel " + getDescription() + " zwitschert! *tweettweet*");
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
