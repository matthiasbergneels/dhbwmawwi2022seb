package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class TravelAgency {

    public static void main(String[] args) throws NotEnoughFreeSlotsException{

        Hotel hilton = new Hotel(100);
        Hotel holidayInn = new Hotel(480);
        AirPlane planeOne = new AirPlane(80);
        AirPlane planeTwo = new AirPlane(500);

        // Narrowing Cast
        Bookable bookableOne = hilton;

        /*
        // Hotel gefunden
        checkSlotsAndBook(2, hilton);

        // Flugzeug gefunden
        checkSlotsAndBook(2, planeTwo);
         */

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
            try {
                bookableEntity.book(100);
                System.out.println("Erfolgreich - 100 Plätze gebucht.");
            } catch(NotEnoughFreeSlotsException e){
                System.out.println("Buchen war nicht erfolgreich!");
                System.out.println(e.getMessage());

                try {
                    bookableEntity.book(e.getFreeSlots());
                    System.out.println("Erfolgreich - restliche Plätze gebucht");
                }catch(NotEnoughFreeSlotsException e1){
                    System.out.println("Hat wieder nicht geklappt.");
                    throw e1;
                }

                return;

            } catch (Exception e){
                System.out.println("Ich fange alle Ausnahmen.");
            }  finally {
                System.out.println("An mir geht kein Weg vorbei!");
            }


            if(bookableEntity instanceof AirPlane currentPlane){
                currentPlane.fly();
            }else{
                System.out.println("Kein Flugzeug");
            }
        }
    }

    /*
    private static boolean checkSlotsAndBook(int slotsToBook, Bookable bookingEntity){
        System.out.println("Buchung in: " + bookingEntity);
        if(bookingEntity.freeSlots() >= slotsToBook){
            System.out.println("Es werden " + slotsToBook + " Plätze gebucht");
            return bookingEntity.book(slotsToBook);
        }
        System.out.println("Nicht genug freie Plätze");
        return false;
    }

     */
}
