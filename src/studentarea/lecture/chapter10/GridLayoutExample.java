package studentarea.lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

  private GridLayoutExample(){
    super();
    this.setTitle("GridLayout Example");

    this.setLayout(new GridLayout(0,2));

    this.add(new JLabel("Text1"));
    this.add(new JLabel("Text2"));
    this.add(new JLabel("Text3"));
    this.add(new JLabel("Text4"));
    this.add(new JLabel("Text5"));
    this.add(new JLabel("Text6"));
    this.add(new JLabel("Text7"));
    this.add(new JLabel("Text8"));
    this.add(new JLabel("Text9"));
    this.add(new JLabel("Text101111111111111111111111111111"));
    this.add(new JButton("Text 11"));

    JPanel cell12 = new JPanel(new FlowLayout());
    cell12.add(new JLabel("Drücke Text 12:"));
    cell12.add(new JButton("Text 12"));

    this.add(cell12);

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new GridLayoutExample();
  }

}
