package studentarea.excersises.chapter8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoSitzeTest {

    @Test
    void testException() throws FalscheParameter{
        Assertions.assertThrows(FalscheParameter.class, () ->{
            AutoSitze Sitze = new AutoSitze(true, "rot");
        });
    }
}