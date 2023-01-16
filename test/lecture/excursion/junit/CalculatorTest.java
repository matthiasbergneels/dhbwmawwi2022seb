package lecture.excursion.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator myCalculator;

    @BeforeEach
    void setup(){
        System.out.println("@BeforeEach - neuer Taschnenrechner");
        myCalculator = new Calculator();
    }


    @Test
    void add() {
        System.out.println("@Test - add");
        // Arrange
        // Test spezifisches Setup

        // Act
        double result = myCalculator.add(10.0, 20.0);

        // Assert
        assertEquals(30.0, result, "Addition ist fehlgeschlagen");
    }

    @Test
    void addWithIntegers() {
        System.out.println("@Test - addWithIntegers");
        // Arrange
        // Test spezifisches Setup

        // Act
        double result = myCalculator.add(10, 20);

        // Assert
        assertEquals(30, result, "Addition ist fehlgeschlagen");
    }

    @AfterEach
    void cleanUp(){
        System.out.println("@AfterEach - Taschenrechner wegwerfen");
        myCalculator = null;
    }
}