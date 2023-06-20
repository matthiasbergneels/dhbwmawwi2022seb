package studentarea.lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

  private BorderLayoutExample(){
    super();
    this.setTitle("GridLayout Example");

    this.setLayout(new BorderLayout());

    this.add(new JButton("Nord"), BorderLayout.NORTH);
    this.add(new JButton("Süd"), BorderLayout.SOUTH);
    this.add(new JButton("Ost"), BorderLayout.EAST);
    this.add(new JButton("West"), BorderLayout.WEST);
    this.add(new JButton("Neuer West"), BorderLayout.WEST);

    JPanel centerPanel = new JPanel(new FlowLayout());
    centerPanel.add(new JLabel("Drücke die Mitte:"));
    centerPanel.add(new JButton("Mitte"));
    this.add(centerPanel, BorderLayout.CENTER);

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new BorderLayoutExample();
  }

}
