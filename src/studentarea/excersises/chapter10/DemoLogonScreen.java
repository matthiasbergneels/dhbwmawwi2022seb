package studentarea.excersises.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class DemoLogonScreen extends JFrame {

  private DemoLogonScreen() {
    this.setLayout(new BorderLayout());
    JPanel inputPanel = setupInputPanel();
    JPanel buttonPanel = setupButtonPanel();
    this.add(inputPanel, "North");
    this.add(buttonPanel, "South");
    this.setBounds(400, 400, 400, 400);
    this.setVisible(true);
  }

  private JPanel setupInputPanel() {
    JPanel inputPanel = new JPanel();
    JPanel verbindungPanel = setupVerbindungPanel();
    JPanel dateiPanel = setupDateiPanel();

    Border etchedBorder = BorderFactory.createEtchedBorder();
    Border rahmenVerbindung = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
    Border rahmenDateien = BorderFactory.createTitledBorder(etchedBorder, "Dateien");

    verbindungPanel.setBorder(rahmenVerbindung);
    dateiPanel.setBorder(rahmenDateien);
    inputPanel.add(verbindungPanel);
    inputPanel.add(dateiPanel);
    inputPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
    return inputPanel;
  }

  private JPanel setupVerbindungPanel() {
    JPanel verbindungPanel = new JPanel(new GridLayout(0, 2));

    JPanel userTextPanel = new JPanel();
    userTextPanel.add(new JLabel("User:"));
    verbindungPanel.add(userTextPanel);
    JPanel userInputPanel = new JPanel();
    userInputPanel.add(new JTextField());
    verbindungPanel.add(userInputPanel);

    JPanel passwortTextPanel = new JPanel();
    passwortTextPanel.add(new JLabel("Passwort:"));
    verbindungPanel.add(passwortTextPanel);
    JPanel passwortInputPanel = new JPanel();
    passwortInputPanel.add(new JTextField());
    verbindungPanel.add(passwortInputPanel);

    JPanel artTextPanel = new JPanel();
    artTextPanel.add(new JLabel("Art:"));
    verbindungPanel.add(artTextPanel);
    JPanel artInputPanel = new JPanel();
    artInputPanel.add(new JComboBox<String>());
    verbindungPanel.add(artInputPanel);

    JPanel hostTextPanel = new JPanel();
    hostTextPanel.add(new JLabel("Host:"));
    verbindungPanel.add(hostTextPanel);
    JPanel hostInputPanel = new JPanel();
    hostInputPanel.add(new JTextField());
    verbindungPanel.add(hostInputPanel);

    JPanel portTextPanel = new JPanel();
    portTextPanel.add(new JLabel("Port:"));
    verbindungPanel.add(portTextPanel);
    JPanel portInputPanel = new JPanel();
    portInputPanel.add(new JTextField());
    verbindungPanel.add(portInputPanel);

    return verbindungPanel;
  }

  private JPanel setupDateiPanel() {
    JPanel dateiPanel = new JPanel(new GridLayout(0, 2));

    JPanel quelleTextPanel = new JPanel();
    quelleTextPanel.add(new JLabel("Quelle:"));
    dateiPanel.add(quelleTextPanel);
    JPanel quelleInputPanel = new JPanel(new FlowLayout());
    quelleInputPanel.add(new JTextField());
    dateiPanel.add(quelleInputPanel);

    JPanel zielTextPanel = new JPanel(new FlowLayout());
    zielTextPanel.add(new JLabel("Ziel:"));
    dateiPanel.add(zielTextPanel);
    JPanel zielInputPanel = new JPanel(new FlowLayout());
    zielInputPanel.add(new JTextField());
    dateiPanel.add(zielInputPanel);

    return dateiPanel;
  }

  private JPanel setupButtonPanel() {
    JPanel buttonPanel = new JPanel(new FlowLayout());
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancel");
    buttonPanel.add(okButton);
    buttonPanel.add(cancelButton);
    return buttonPanel;
  }

  public static void main(String[] args) {
    var screen = new DemoLogonScreen();
  }
}
