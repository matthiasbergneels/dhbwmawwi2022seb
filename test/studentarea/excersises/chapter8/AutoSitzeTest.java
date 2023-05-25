package studentarea.excersises.chapter8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutoSitzeTest {

    @Test
    void testException() throws FalscheParameter {
        Assertions.assertThrowsExactly(FalscheParameter.class, () -> {
            new AutoSitze(true, Farbe.BLAU);
        });
    }

    @Test
    void test_NoException() throws FalscheParameter {
        Assertions.assertDoesNotThrow(() -> {
            new AutoSitze(true, Farbe.WEISS);
            new AutoSitze(true, Farbe.SCHWARZ);
        });
    }
}