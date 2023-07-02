package studentarea.excersises.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class SwingUi extends JFrame {

  private SwingUi(){

    this.setTitle("Logon");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());

    JPanel centerPanel = new JPanel(new FlowLayout());
    centerPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));


    JPanel grid1 = new JPanel(new GridLayout(0,2));

    grid1.setBorder(BorderFactory.createTitledBorder("Verbindungen"));

    grid1.add(new JLabel("User:"));
    grid1.add(new JTextField());
    grid1.add(new JLabel("Passwort:"));
    grid1.add(new JPasswordField());
    grid1.add(new JLabel("Art:"));
    grid1.add(new JComboBox(new String[]{"FTP"}));
    grid1.add(new JLabel("Host:"));
    grid1.add(new JTextField());
    grid1.add(new JLabel("Port:"));
    grid1.add(new JTextField());

    JPanel grid2 = new JPanel(new GridLayout(0,2));
    grid2.setBorder(BorderFactory.createTitledBorder("Dateien"));

    grid2.add(new JLabel("Quelle:"));
    grid2.add(new JTextField());
    grid2.add(new JLabel("Ziel:"));
    grid2.add(new JTextField());

    centerPanel.add(grid1);
    centerPanel.add(grid2);

    JPanel bottomPanel = new JPanel(new FlowLayout());

    bottomPanel.add(new JButton("OK"));
    bottomPanel.add(new JButton("Cancel"));

    this.add(centerPanel, BorderLayout.CENTER);
    this.add(bottomPanel, BorderLayout.SOUTH);

    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUi ui = new SwingUi();
  }
}
