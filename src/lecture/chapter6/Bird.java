package lecture.chapter6;

public final class Bird extends Animal{     // --> durch final kann nicht mehr abgeleitet werden

    private boolean canFly;

    public Bird(float weight, float size, String description, boolean canFly) {
        super(weight, size, description);
        setCanFly(canFly);
    }

    public void eat(){
        System.out.println("Der Vogel " + getDescription() + " pickt Körner auf.");
    }

    @Override
    public void breath() {
        System.out.println("Der Vogel " + getDescription() + " atmet! *fiepfiep*");
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
