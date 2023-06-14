## 3. Uebung
Im folgenden Quellcode befindet sich ein logischer Fehler. 
Worin besteht er und wie kann er behoben werden?

````java
public class TankLeerDemo {
public static void main(String[] args) {
    
        Auto bmw = new Auto(0, 35487); 
        bmw.tanken();
        
        try {
          bmw.fahren();
        } catch (TankLeer e) {
            System.out.println(e.getMessage());
        }
        
        bmw.tanken();
        
        try {
            bmw.fahren();
        } catch (Exception e) {
            e.printStackTrace(); 
        } catch (TankLeer e) { // 1
            System.out.println(e.getMessage()); 
            System.out.println(e.toString()); 
            e.printStackTrace();
        } finally {
            System.out.println("Der neue Kilometerstand: " + bmw.getKmCount()); 
        } 
    }
}
````

## Antwort
1. Die Reihenfolge der Exceptions ist falsch. Der erste Catch fängt alle Exceptions ab. 
    Das heißt, dass die Exception "TankLeer" nie benutzt wird -> Um das zu verbessern: catches vertauschen
