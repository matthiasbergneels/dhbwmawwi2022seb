package studentarea.excersises.chapter10;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LogonPage {



  public static void main(String[] args) {

  JFrame logonPage = new JFrame("Logon");
  logonPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  logonPage.setVisible(true);
  logonPage.setSize(500,400);


  JPanel mainPanel = new JPanel(new GridLayout(2,0));

  //Input fields
  JPanel inputFields = new JPanel(new GridLayout(0,2));

  //Input Connection fields
  JPanel inputFieldsConnection = new JPanel(new GridLayout(5,2));
  inputFieldsConnection.setBorder(BorderFactory.createTitledBorder("Verbindungen"));

  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JLabel("User:")));
  //inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JTextField()));
  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JTextField()));

  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JLabel("Passwort:")));
  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JPasswordField()));

  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JLabel("Art:")));
  JComboBox<String> connectionOptions= new JComboBox<String>();
  connectionOptions.addItem("FTP");
  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(connectionOptions));

  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JLabel("Host:")));
  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JTextField()));

  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JLabel("Port:")));
  inputFieldsConnection.add(new JPanel(new FlowLayout(0)).add(new JTextField()));

  //Input File fields
    JPanel inputFieldsFile = new JPanel(new GridLayout(2,2));
  inputFieldsFile.setBorder(BorderFactory.createTitledBorder("Dateien"));

    inputFieldsFile.add(new JPanel(new FlowLayout(0)).add(new JLabel("Quelle:")));
    inputFieldsFile.add(new JPanel(new FlowLayout(0)).add(new JTextField()));
    // inputFieldsFile.add(new JPanel(new FlowLayout(0)).add(new JTextField()));

    inputFieldsFile.add(new JPanel(new FlowLayout(0)).add(new JLabel("Ziel:")));
    inputFieldsFile.add(new JPanel(new FlowLayout(0)).add(new JTextField()));

  //inputFields.add(inputFieldsConnection);
  inputFields.add(new JFrame().add(inputFieldsConnection));
  inputFields.add(inputFieldsFile);







    mainPanel.add(inputFields);

  //Buttons
  JPanel buttonPanel = new JPanel(new BorderLayout());
  JPanel buttons = new JPanel(new FlowLayout(1));
  buttons.add(new JButton("OK"));
  buttons.add(new JButton("Cancel"));

  buttonPanel.add(buttons, BorderLayout.SOUTH);



  mainPanel.add(buttonPanel);




  logonPage.add(mainPanel);


  }

}
