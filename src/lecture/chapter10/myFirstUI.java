package lecture.chapter10;

import javax.swing.*;

public class myFirstUI {

  public static void main(String[] args) {

    JFrame myFirstFrame = new JFrame("Mein erstes Java UI");

    JLabel myLabel = new JLabel("Hallo Kurs");

    myFirstFrame.add(myLabel);
    //myFirstFrame.getContentPane().add(myLabel);

    //myFirstFrame.setSize(200, 200);

    myFirstFrame.pack();
    myFirstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFirstFrame.setVisible(true);

    System.out.println("Ende von main()");
  }
}
