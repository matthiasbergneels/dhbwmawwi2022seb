package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class myFirstUI {

  public static void main(String[] args) {

    JFrame myFirstFrame = new JFrame("Mein erstes Java UI");
    myFirstFrame.setLayout(new FlowLayout());

    JLabel myLabel = new JLabel("Hallo Kurs");
    JButton myButton = new JButton("Aktivieren");

    myFirstFrame.add(myLabel);
    myFirstFrame.add(myButton);

    //myFirstFrame.getContentPane().add(myLabel);

    //myFirstFrame.setSize(200, 200);

    myFirstFrame.pack();
    myFirstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFirstFrame.setVisible(true);

    System.out.println("Ende von main()");
  }
}
