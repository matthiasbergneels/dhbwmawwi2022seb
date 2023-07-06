package studentarea.excersises.chapter10;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class Logon extends JFrame {

  public Logon(){
    super("Logon");

    this.getContentPane().setLayout(new BorderLayout());

    Border rahmen1 = BorderFactory.createTitledBorder(new EtchedBorder(), "Verbindung");
    JPanel contentPanel = new JPanel();

    JPanel verbindungsPanel = new JPanel();
    GridLayout gridLayout = new GridLayout(0,2);
    gridLayout.setVgap(5);
    verbindungsPanel.setBorder(rahmen1);
    verbindungsPanel.setLayout(gridLayout);
    verbindungsPanel.add(new JLabel("User: "));
    verbindungsPanel.add(new JTextField());
    verbindungsPanel.add(new JLabel("Passwort: "));
    verbindungsPanel.add(new JTextField());
    verbindungsPanel.add(new JLabel("Art: "));
    verbindungsPanel.add(new JComboBox<String>(new String[]{"FTP"}));
    verbindungsPanel.add(new JLabel("Host: "));
    verbindungsPanel.add(new JTextField());
    verbindungsPanel.add(new JLabel("Port: "));
    verbindungsPanel.add(new JTextField());



    JPanel dateienPanel = new JPanel();
    dateienPanel.setLayout(gridLayout);
    dateienPanel.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(), "Dateien"));
    dateienPanel.add(new JLabel("Quelle: "));
    dateienPanel.add(new JTextField());
    dateienPanel.add(new JLabel("Ziel: "));
    dateienPanel.add(new JTextField());

    contentPanel.add(verbindungsPanel, BorderLayout.WEST);
    contentPanel.add(dateienPanel, BorderLayout.EAST);

    //create the button panel
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
    buttonPanel.add(new JButton("OK"));
    buttonPanel.add(new JButton("Cancel"));

    this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    this.getContentPane().add(contentPanel, BorderLayout.CENTER);

    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Logon();
  }
}
