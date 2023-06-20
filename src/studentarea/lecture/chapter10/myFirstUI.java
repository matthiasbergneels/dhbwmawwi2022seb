package studentarea.lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class myFirstUI {

  public static void main(String[] args) {

    JFrame myFirstFrame = new JFrame("Logon");
    myFirstFrame.setLayout(new BorderLayout());

    Button okButton = new Button();
    okButton.setLabel("OK");
    Button cancelButton = new Button();
    cancelButton.setLabel("Cancel");

    JLabel verbindungLabel = new JLabel("Verbindung");
    JPanel verbindungPanel = new JPanel( new FlowLayout());
    verbindungPanel.add(verbindungLabel);

    JPanel userPanel = new JPanel( new FlowLayout());
    userPanel.add(new JLabel("User:"));
    userPanel.add(new JTextField(10));

    JPanel passwordPanel = new JPanel( new FlowLayout());
    passwordPanel.add(new JLabel("Password:"));
    passwordPanel.add(new JTextField(10));

    JPanel artPanel = new JPanel( new FlowLayout());
    artPanel.add(new JLabel("Art:"));
    artPanel.add(new JComboBox<String>(new String[]{"FTP", "UDP"}));

    JPanel hostPanel = new JPanel( new FlowLayout());
    hostPanel.add(new JLabel("Host:"));
    hostPanel.add(new JTextField(10));

    JPanel portPanel = new JPanel( new FlowLayout());
    portPanel.add(new JLabel("Port:"));
    portPanel.add(new JTextField(10));

    JPanel dateienPanel = new JPanel( new FlowLayout());
    dateienPanel.add(new JLabel("Dateien"));

    JPanel quellePanel = new JPanel( new FlowLayout());
    quellePanel.add(new JLabel("Quelle:"));
    quellePanel.add(new JTextField(20));

    JPanel zielPanel = new JPanel( new FlowLayout());
    zielPanel.add(new JLabel("Ziel:"));
    zielPanel.add(new JTextField(20));



    JPanel redJPanel = new JPanel();
    JPanel greenJPanel = new JPanel();
    JPanel blueJPanelLeft = new JPanel();
    JPanel blueJPanelRight = new JPanel();

    redJPanel.setLayout(new FlowLayout());
    greenJPanel.setLayout(new FlowLayout());
    blueJPanelLeft.setLayout(new GridLayout(6, 1));
    blueJPanelRight.setLayout(new GridLayout(3, 1));

    blueJPanelLeft.add(verbindungPanel);
    blueJPanelLeft.add(userPanel);
    blueJPanelLeft.add(passwordPanel);
    blueJPanelLeft.add(artPanel);
    blueJPanelLeft.add(hostPanel);
    blueJPanelLeft.add(portPanel);
    blueJPanelRight.add(dateienPanel);
    blueJPanelRight.add(quellePanel);
    blueJPanelRight.add(zielPanel);


    redJPanel.add(blueJPanelLeft);
    redJPanel.add(blueJPanelRight);
    greenJPanel.add(okButton);
    greenJPanel.add(cancelButton);


    myFirstFrame.getContentPane().add(redJPanel, BorderLayout.NORTH);
    myFirstFrame.getContentPane().add(greenJPanel, BorderLayout.SOUTH);


    //myFirstFrame.add(redJPanel);
    //myFirstFrame.add(greenJPanel);


    myFirstFrame.pack();
    myFirstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFirstFrame.setVisible(true);

    System.out.println("Ende von main()");
  }
}
