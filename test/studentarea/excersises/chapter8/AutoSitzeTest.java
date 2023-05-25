package studentarea.excersises.chapter8;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class AutoSitzeTest {



    @Test
    public void BezugTest() throws FalscheParameter{

        Assertions.assertThrows(FalscheParameter.class, new Executable(){
            @Override
            public void execute() throws Throwable {
                AutoSitze autoSitze = new AutoSitze(true, "blau");
            }
        });

    }

}