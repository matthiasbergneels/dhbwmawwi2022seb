package studentarea.excersises.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class DemoLogonScreen extends JFrame {

  private DemoLogonScreen(){
    super("Logon");

    JPanel centerPanel = new JPanel(new FlowLayout());
    centerPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
    centerPanel.add(createVerbindungenPanel());
    centerPanel.add(createDateienPanel());
    this.add(centerPanel);

    JPanel lowerButtonsPanel = new JPanel(new FlowLayout());
    lowerButtonsPanel.add(new JButton("OK"));
    lowerButtonsPanel.add(new JButton("Cancel"));
    this.add( lowerButtonsPanel, BorderLayout.SOUTH);

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  private JPanel createDateienPanel(){
    JPanel DateienPanel = new JPanel(new GridLayout(0,2));
    DateienPanel.setBorder(BorderFactory.createTitledBorder("Dateien"));
    DateienPanel.add(new JLabel("Quelle:"));
    DateienPanel.add(getLeftTextFieldPanel(8));
    DateienPanel.add(new JLabel("Ziel:"));
    DateienPanel.add(getLeftTextFieldPanel(8));
    return DateienPanel;
  }

  private JPanel createVerbindungenPanel(){
    JPanel VerbindungenPanel = new JPanel(new GridLayout(0,2));
    VerbindungenPanel.setBorder(BorderFactory.createTitledBorder("Verbindung"));
    VerbindungenPanel.add(new JLabel("User:"));
    VerbindungenPanel.add(getLeftTextFieldPanel(2));
    VerbindungenPanel.add(new JLabel("Passwort:"));
    VerbindungenPanel.add(getLeftTextFieldPanel(3));
    VerbindungenPanel.add(new JLabel("Art:"));
    final String[] types = {"FTP"};
    VerbindungenPanel.add(new JComboBox<>(types));
    VerbindungenPanel.add(new JLabel("Host:"));
    VerbindungenPanel.add(getLeftTextFieldPanel(3));
    VerbindungenPanel.add(new JLabel("Port:"));
    VerbindungenPanel.add(getLeftTextFieldPanel(1));
    return VerbindungenPanel;
  }


  private JPanel getLeftTextFieldPanel(int columns) {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel.add(new JTextField(columns));
    return panel;
  }

  public static void main(String[] args) {
    new DemoLogonScreen();
  }
}