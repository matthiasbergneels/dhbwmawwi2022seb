package studentarea.excersises.chapter10;

import javax.swing.*;
import java.awt.*;

public class LogonPagev2 {



  public static void main(String[] args) {

  JFrame logonPage = new JFrame("Logon V2");
  logonPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  logonPage.setVisible(true);
  logonPage.setSize(400,300);

  //Main Panel with Border Layout
  JPanel mainPanel = new JPanel(new BorderLayout());

    //Panel for Input Fields
    JPanel panelForInputFields = new JPanel(new FlowLayout());

      //Panel for Connection Input in Panel for Input Fields
      JPanel panelForConnectionInputFields = new JPanel(new GridLayout(5,2));
      panelForConnectionInputFields.setBorder(BorderFactory.createTitledBorder("Connection"));

      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(new JLabel("User:")));
      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(new JTextField()));

      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(new JLabel("Password:")));
      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(new JPasswordField()));

      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(new JLabel("Type:")));
      JComboBox<String> connectionOptions= new JComboBox<String>();
      connectionOptions.addItem("FTP");
      connectionOptions.addItem("Brieftaube");
      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(connectionOptions));

      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(new JLabel("Host:")));
      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(new JTextField()));

      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(new JLabel("Port:")));
      panelForConnectionInputFields.add(new JPanel(new FlowLayout()).add(new JTextField()));


    panelForInputFields.add(panelForConnectionInputFields);

      //Panel for File Input in Panel for Input Fields
      JPanel panelForFileInputFields = new JPanel(new GridLayout(2,2));
      panelForFileInputFields.setBorder(BorderFactory.createTitledBorder("Files"));

      panelForFileInputFields.add(new JPanel(new FlowLayout()).add(new JLabel("Source:")));
      panelForFileInputFields.add(new JPanel(new FlowLayout()).add(new JTextField()));

      panelForFileInputFields.add(new JPanel(new FlowLayout()).add(new JLabel("Target:")));
      panelForFileInputFields.add(new JPanel(new FlowLayout()).add(new JTextField()));




      panelForInputFields.add(panelForFileInputFields);

    mainPanel.add(panelForInputFields, BorderLayout.NORTH);

    //Panel for Buttons
    JPanel panelForButtons = new JPanel(new FlowLayout());

      panelForButtons.add(new JButton("OK"));
      panelForButtons.add(new JButton("Cancel"));

  mainPanel.add(panelForButtons, BorderLayout.SOUTH);






  logonPage.add(mainPanel);


  }

}
