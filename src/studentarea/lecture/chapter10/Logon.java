package studentarea.lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class Logon extends JFrame {

  private Logon() {
    super();
    this.setTitle("Test Logon");
    this.setLayout(new BorderLayout());

    // Top Panel
    JPanel topPanel = new JPanel();
    topPanel.setLayout(new FlowLayout());

    // Verbindung Panel
    JPanel verbindungPanel = new JPanel();
    verbindungPanel.setBorder(BorderFactory.createTitledBorder("Verbindung"));
    verbindungPanel.setLayout(new GridLayout(5,1));
    verbindungPanel.setName("Verbidnung");
    verbindungPanel.add(createIndiviuellPanel(new JLabel("User"), new JTextField(7)));
    verbindungPanel.add(createIndiviuellPanel(new JLabel("Passwort"), new JTextField(8)));
    verbindungPanel.add(createIndiviuellPanel(new JLabel("Art"), new JTextField(5)));
    verbindungPanel.add(createIndiviuellPanel(new JLabel("Host"), new JTextField(6)));
    verbindungPanel.add(createIndiviuellPanel(new JLabel("Port"), new JTextField(3)));


    // Dateien Panel
    JPanel dateienPanel = new JPanel();
    dateienPanel.setBorder(BorderFactory.createTitledBorder("Dateien"));
    dateienPanel.setLayout(new GridLayout(2,1));
    dateienPanel.setName("Dateien");
    dateienPanel.add(createIndiviuellPanel(new JLabel("Quelle"), new JTextField(10)));
    dateienPanel.add(createIndiviuellPanel(new JLabel("Ziel"), new JTextField(10)));

    // Button Panel
    JPanel bottomPanel = new JPanel();
    bottomPanel.setLayout(new FlowLayout());
    bottomPanel.add(new JButton("Ok"));
    bottomPanel.add(new JButton("Cancel"));




    topPanel.add(verbindungPanel);
    topPanel.add(dateienPanel);
    this.add(topPanel, BorderLayout.NORTH);
    this.add(bottomPanel, BorderLayout.SOUTH);

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }


  public static void main(String[] args) {
    new Logon();
  }

  private JPanel createIndiviuellPanel(JLabel label, JTextField textInput) {
    JPanel p = new JPanel();
    p.setLayout(new FlowLayout());
    p.add(label);
    p.add(textInput);

    return p;
  }
}
