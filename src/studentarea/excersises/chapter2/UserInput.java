package studentarea.excersises.chapter2;

import javax.swing.*;

public class UserInput {

    public static int returnUserInputAsInteger(String inputExplanation){
        String userInput = JOptionPane.showInputDialog(inputExplanation);
        return Integer.parseInt(userInput);
    }
}
