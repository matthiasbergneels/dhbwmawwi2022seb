package lecture.excursion.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Taschenrechner Testfälle")
class CalculatorTest {

    Calculator myCalculator;

    @BeforeAll
    static void initialeSetup(){
        System.out.println("@BeforeAll - einmal vor Allem");
    }

    @BeforeEach
    void setup(){
        System.out.println("@BeforeEach - einmal vor jedem Test - neuer Taschenrechner");
        myCalculator = new Calculator();
    }


    @Nested
    @DisplayName("Additions Testfälle")
    class addTestCases {

        @BeforeEach
        void setup(){
            System.out.println("@BeforeEach - addTestCases - einmal vor jedem Test");
        }

        @Test
        @DisplayName("Normale Addition mit Double")
        @Tag("integration")
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
        @DisplayName("Normale Addition mit Integer")
        @Tag("integration")
        void addWithIntegers() {
            System.out.println("@Test - addWithIntegers");
            // Arrange
            // Test spezifisches Setup

            // Act
            double result = myCalculator.add(10, 20);

            // Assert
            assertEquals(30, result, "Addition ist fehlgeschlagen");
        }

        @Test
        @Tag("plainUnit")
        @RepeatedTest(5)
        void addZeros() {
            // Arrange
            // Test spezifisches Setup

            // Act
            double result = myCalculator.add(0, 0);

            // Assert
            assertEquals(0, result, "Addition ist fehlgeschlagen");
        }

        @AfterEach
        void cleanUp(){
            System.out.println("@AfterEach - addTestCases - einmal nach jedem Test");
        }
    }

    @Nested
    class MultiplyTestCases{

        @ParameterizedTest(name = "{0} multipliziert mit {1} ergibt {2}")
        @DisplayName("Parametrisierter Multiplikations Test")
        @CsvSource({
                "10.0, 5.0, 50.0",
                "5.0, 0.0, 0.0",
                "-10.0, 10.0, -100.0"
        })
        void multiplyDoubleValues(double numberA, double numberB, double expectedResult){
            // Arrange
            // nichts zu tun

            // Act
            double result = myCalculator.multiply(numberA, numberB);

            // Assert
            assertEquals(expectedResult, result);
        }

        @ParameterizedTest(name = "{0} multipliziert mit {1} ergibt {2}")
        @DisplayName("Parametrisierter Multiplikations Test aus CSV Datei")
        @CsvFileSource(resources = "/MulitplyTestCases.csv")
        void multiplyDoubleValuesExternal(double numberA, double numberB, double expectedResult){
            // Arrange
            // nichts zu tun

            // Act
            double result = myCalculator.multiply(numberA, numberB);

            // Assert
            assertEquals(expectedResult, result);
        }

        @ParameterizedTest(name = "{0} multipliziert mit {1} ergibt {2}")
        @DisplayName("Parametrisierter Multiplikations Test aus Methode")
        @MethodSource("lecture.excursion.junit.CalculatorTest#provideMultiplyTestCases")
        void multiplyDoubleValuesMethod(double numberA, double numberB, double expectedResult){
            // Arrange
            // nichts zu tun

            // Act
            double result = myCalculator.multiply(numberA, numberB);

            // Assert
            assertEquals(expectedResult, result);
        }

    }


    @Test
    void minusTestCas(){
        // Arrange

        // Act
        double result = myCalculator.minus(20.0, 10.0);

        // Assert
        assertEquals(10.0, result);
    }

    @AfterEach
    void cleanUp(){
        System.out.println("@AfterEach - Taschenrechner wegwerfen");
        myCalculator = null;
    }

    @AfterAll
    static void finalCleanUp(){
        System.out.println("@AfterAll - einmal nach Allem");
    }


    static Stream provideMultiplyTestCases(){
        return Stream.of(
                Arguments.of(10.0, 10.0, 100.0),
                Arguments.of(5.0, 4.0, 20.0),
                Arguments.of(0.0, 10.0, 0.0)
                // ... mehr Testfälle
        );
    }
}