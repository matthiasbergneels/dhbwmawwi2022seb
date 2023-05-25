package studentarea.excersises.chapter8;

import java.util.Arrays;

public class FalscheParameter extends Exception {

    public FalscheParameter(Object...params) {
        super(generateMessage(params));
    }

    private static String generateMessage(Object[] params) {
        StringBuilder sbuilder = new StringBuilder("Unglütige Kombination der Paramter:");
        Arrays.stream(params).forEach((param) -> {
            sbuilder.append(param).append(", ");
        });
        return sbuilder.toString();
    }
}
