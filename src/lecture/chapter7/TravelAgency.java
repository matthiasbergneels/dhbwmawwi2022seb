package lecture.chapter7;

public class TravelAgency {

    public static void main(String[] args) {

        Hotel hilton = new Hotel(100);
        Hotel holidayInn = new Hotel(480);
        AirPlane planeOne = new AirPlane(80);
        AirPlane planeTwo = new AirPlane(500);

        // Narrowing Cast
        Bookable bookableOne = hilton;

        // Hotel gefunden
        checkSlotsAndBook(2, hilton);

        // Flugzeug gefunden
        checkSlotsAndBook(2, planeTwo);


        Bookable[] bookableEntities = new Bookable[5];

        // Narrowing Casts
        bookableEntities[0] = hilton;
        bookableEntities[1] = holidayInn;
        bookableEntities[2] = planeTwo;
        bookableEntities[3] = planeOne;

        for(Bookable bookableEntity : bookableEntities){
            if(bookableEntity == null){
                continue;
            }

            // Polymorphie
            System.out.println("Freie Plätze: " + bookableEntity.freeSlots());

            // Polymorphie
            boolean successfullBooking = bookableEntity.book(100);

            if(successfullBooking){
                System.out.println("Die Plätze wurden gebucht");
                System.out.println("Es sind noch " + bookableEntity.freeSlots() + " Plätze frei");
            } else {
                System.out.println("Nicht genug freie Plätze");
                if(bookableEntity instanceof PriorityBookable priorityBookableEntity){
                    priorityBookableEntity.bookWithPriority(100);
                }
            }

            if(bookableEntity instanceof AirPlane currentPlane){
                currentPlane.fly();
            }else{
                System.out.println("Kein Flugzeug");
            }
        }
    }

    private static boolean checkSlotsAndBook(int slotsToBook, Bookable bookingEntity){
        System.out.println("Buchung in: " + bookingEntity);
        if(bookingEntity.freeSlots() >= slotsToBook){
            System.out.println("Es werden " + slotsToBook + " Plätze gebucht");
            return bookingEntity.book(slotsToBook);
        }
        System.out.println("Nicht genug freie Plätze");
        return false;
    }
}
