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
  //  verbindung.add(new JLabel("Verbindung"));

 //   logon.add(verbindung);
    mainPanel.add(verbindung);

    // User:
    JPanel user = new JPanel(new FlowLayout(FlowLayout.LEFT));
    user.add(new JLabel("User: "));
    user.add(new JTextField(4));
    verbindung.add(user);


    // Passwort:
    JPanel passwort = new JPanel(new FlowLayout(FlowLayout.LEFT));
    passwort.add(new JLabel("Passwort: "));
    passwort.add(new JPasswordField(5));
    verbindung.add(passwort);

    //Art
    JPanel art = new JPanel(new FlowLayout(FlowLayout.LEFT));
    String arten[] = {"FTP", "ABC", "DEF"};
    art.add(new JLabel("Art: "));
    art.add(new JComboBox<String>(arten));
    verbindung.add(art);

    //Host:
    JPanel host = new JPanel(new FlowLayout(FlowLayout.LEFT));
    host.add(new JLabel("Host: "));
    host.add(new JTextField(5));
    verbindung.add(host);

    //PorT:
    JPanel port = new JPanel(new FlowLayout(FlowLayout.LEFT));
    port.add(new JLabel("Port: "));
    port.add(new JTextField(2));
    verbindung.add(port);

    /////////////////////////////////////////////////////////////////////////

    // Dateien

    JPanel datei = new JPanel(new GridLayout(2, 2));
  //  datei.add(new JLabel("Dateien"));

//    logon.add(datei);
    mainPanel.add(datei);
    //Host:
    JPanel quelle = new JPanel(new FlowLayout(FlowLayout.LEFT));
    quelle.add(new JLabel("Quelle: "));
    quelle.add(new JTextField(12));
    datei.add(quelle);

    //PorT:
    JPanel ziel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    ziel.add(new JLabel("Ziel: "));
    ziel.add(new JTextField(12));
    datei.add(ziel);

    /////////////////////////////////////////////////////////////////////////

    //Buttons

    JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

    buttons.add(new JButton("OK"));
    buttons.add(new JButton("Cancel"));

    logon.add(buttons, BorderLayout.SOUTH);


    ///////////////////////////////////////////////////////////////

    verbindung.setBorder(rahmen2);
    datei.setBorder(rahmen3);
//  rechteEingabe2.setBorder(rahmen4);
    mainPanel.setBorder(rahmen5);

    logon.pack();
    logon.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    logon.setVisible(true);
  }



}
