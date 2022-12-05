package lecture.chapter5;

public class Bar {
    public static void main(String[] args) {

        Student firstStudent = new Student(4711);

        firstStudent.drink(1f);                                // --> dring(float)
        firstStudent.drink(0.5f, 11.0);       // --> drink(float, double)
        firstStudent.drink(0.2f, true);              // --> drink(float, boolean)
        firstStudent.drink(50.0, 0.33f);            // --> drink(double, float)

    }
}
