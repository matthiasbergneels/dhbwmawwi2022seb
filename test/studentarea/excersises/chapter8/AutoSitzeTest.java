package studentarea.excersises.chapter8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutoSitzeTest {

    @Test
    void testException() throws FalscheParameter {
        Assertions.assertThrowsExactly(FalscheParameter.class, () -> {
            new AutoSitze(true, Farbe.Blau);
        });
    }

    @Test
    void test_NoException() throws FalscheParameter {
        Assertions.assertDoesNotThrow(() -> {
            new AutoSitze(true, Farbe.Weiß);
            new AutoSitze(true, Farbe.Schwarz);
        });
    }
}