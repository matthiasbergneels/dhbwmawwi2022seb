package lecture.chapter4;

public class SwitchExample {

    public static void main(String[] args) {

        int grade = 3;

        switch(grade){
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            default:
                System.out.println("Ungültige Note");
        }


        switch(grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Bestanden");
                break;
            case 5:
            case 6:
                System.out.println("Durchgefallen");
                break;
            default:
                System.out.println("Ungültige Note");
        }

        enum Days {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        Days day = Days.MONDAY;

        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            default      -> {
                String s = day.toString();
                int result = s.length();
                yield result;
            }
        };

        System.out.println("Anzahl Buchstaben: " + numLetters);

        switch(day){
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY -> System.out.println(7);
        }


    }
}
