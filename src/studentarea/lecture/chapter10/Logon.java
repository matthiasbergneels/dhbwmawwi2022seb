package studentarea.lecture.chapter10;

import javax.swing.*;
import java.awt.*;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;

public class Logon {
  public static void main(String[] args) {


    JFrame logon = new JFrame("Logon");

    logon.setLayout(new BorderLayout());

    JPanel mainPanel = new JPanel(new FlowLayout());

    logon.add(mainPanel);

    /////////////////////////////////////////////////////////////////

    // Rahmen

    Border rahmen1 = BorderFactory.createEtchedBorder();
    Border rahmen2 = BorderFactory.createTitledBorder(rahmen1, "Verbindung");
    Border rahmen3 = BorderFactory.createTitledBorder(rahmen1, "Dateien");
    Border rahmen4 = BorderFactory.createTitledBorder(rahmen1, "Berechtigungen");
    Border rahmen5 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);




    ///////////////////////////////////////////////////////////////////

    // Verbindung
    JPanel verbindung = new JPanel(new GridLayout(5, 2));



    mainPanel.add(verbindung);

    // User:
    JPanel user = new JPanel(new FlowLayout(FlowLayout.LEFT));
    user.add(new JLabel("User: "));
    verbindung.add(user);
    JPanel tfUser = new JPanel(new FlowLayout(FlowLayout.LEFT));
    tfUser.add(new JTextField(3));
    verbindung.add(tfUser);


    // Passwort:
    JPanel passwort = new JPanel(new FlowLayout(FlowLayout.LEFT));
    passwort.add(new JLabel("Passwort: "));
    verbindung.add(passwort);

    JPanel tfPasswort = new JPanel(new FlowLayout(FlowLayout.LEFT));
    tfPasswort.add(new JPasswordField(4));
    verbindung.add(tfPasswort);

    //Art
    JPanel art = new JPanel(new FlowLayout(FlowLayout.LEFT));
    art.add(new JLabel("Art: "));
    verbindung.add(art);

    String arten[] = {"FTP", "ABC", "DEF"};
    JPanel tfArt = new JPanel(new FlowLayout(FlowLayout.LEFT));
    tfArt.add(new JComboBox<String>(arten));
    verbindung.add(tfArt);

    //Host:
    JPanel host = new JPanel(new FlowLayout(FlowLayout.LEFT));
    host.add(new JLabel("Host: "));
    verbindung.add(host);

    JPanel tfHost = new JPanel(new FlowLayout(FlowLayout.LEFT));
    tfHost.add(new JTextField(4));
    verbindung.add(tfHost);

    //PorT:
    JPanel port = new JPanel(new FlowLayout(FlowLayout.LEFT));
    port.add(new JLabel("Port: "));
    verbindung.add(port);

    JPanel tfPort = new JPanel(new FlowLayout(FlowLayout.LEFT));
    tfPort.add(new JTextField(1));
    verbindung.add(tfPort);

    /////////////////////////////////////////////////////////////////////////

    // Dateien

    JPanel datei = new JPanel(new GridLayout(2, 2));

    mainPanel.add(datei);


    //Host:
    JPanel quelle = new JPanel(new FlowLayout(FlowLayout.LEFT));
    quelle.add(new JLabel("Quelle: "));
    datei.add(quelle);

    JPanel tfQuelle = new JPanel(new FlowLayout(FlowLayout.LEFT));
    tfQuelle.add(new JTextField(12));
    datei.add(tfQuelle);

    //PorT:
    JPanel ziel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    ziel.add(new JLabel("Ziel: "));
    datei.add(ziel);

    JPanel tfZiel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    tfZiel.add(new JTextField(12));
    datei.add(tfZiel);

    /////////////////////////////////////////////////////////////////////////

    //Buttons

    JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

    buttons.add(new JButton("OK"));
    buttons.add(new JButton("Cancel"));

    logon.add(buttons, BorderLayout.SOUTH);


    ///////////////////////////////////////////////////////////////

    //Border


    verbindung.setBorder(rahmen2);
    datei.setBorder(rahmen3);
    mainPanel.setBorder(rahmen5);

    logon.pack();
    logon.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    logon.setVisible(true);
  }



}
