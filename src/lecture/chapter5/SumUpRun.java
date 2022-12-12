package lecture.chapter5;

public class SumUpRun {

    public static void main(String[] args) {
        SumUp summarizer = new SumUp();
        System.out.println(summarizer.sum());
        System.out.println(summarizer.sum(1));
        System.out.println(summarizer.sum(1, 2));
        System.out.println(summarizer.sum(1, 2, 3));
        System.out.println(summarizer.sum(1, 2, 3, 4));
        System.out.println(summarizer.sum(1, 2, 3, 4, 5));
    }
}
