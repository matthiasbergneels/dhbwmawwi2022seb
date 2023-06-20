package studentarea.lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

  private FlowLayoutExample(){
    super();
    this.setTitle("FlowLayout Example");

    this.setLayout(new FlowLayout(FlowLayout.LEFT));

    this.add(new JLabel("Text1"));
    this.add(new JLabel("Text2"));
    this.add(new JLabel("Text3"));
    this.add(new JLabel("Text4"));
    this.add(new JLabel("Text5"));
    this.add(new JLabel("Text6"));

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new FlowLayoutExample();
  }
}
