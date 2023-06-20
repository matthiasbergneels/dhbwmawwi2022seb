package studentarea.excersises.chapter10;

import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class DemoLogonScreen extends JFrame {
  public DemoLogonScreen(String title) throws HeadlessException {
    super(title);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    DemoLogonScreen Window = new DemoLogonScreen("Logon");
    JPanel MainPanel = new JPanel(new BorderLayout());
    JPanel ButtonPanel = new JPanel(new FlowLayout());
    JPanel ContentPanel = new JPanel(new FlowLayout());
    JPanel LeftContent = new JPanel(new GridLayout(0, 2));
      JPanel Left1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
      JPanel Left2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
      JPanel Left3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
      JPanel Left4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel RightContent = new JPanel(new GridLayout(0, 2));
    CompoundBorder ContentBorder = BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED), BorderFactory.createEmptyBorder(15,15,15,15));
    String [] arr = {"FTP", "HTTPS", "SFTP"};

    //Ich glaub es geht schon wieder los
    Window.add(MainPanel);
    MainPanel.add(ContentPanel, BorderLayout.CENTER);
    MainPanel.add(ButtonPanel, BorderLayout.SOUTH);

    ContentPanel.add(LeftContent);
    ContentPanel.add(RightContent);
    ContentPanel.setBorder(ContentBorder);

    //LeftContent
    LeftContent.setBorder(BorderFactory.createTitledBorder("Verbindung"));
    LeftContent.add(new JLabel("User:"));
    Left1.add(new JTextField(2));
    LeftContent.add(Left1);

    LeftContent.add(new JLabel("Passwort:"));
    Left2.add(new JTextField(4));
    LeftContent.add(Left2);

    LeftContent.add(new JLabel("Art:"));
    LeftContent.add(new JComboBox<>(arr));

    LeftContent.add(new JLabel("Host:"));
    Left3.add(new JTextField(4));
    LeftContent.add(Left3);

    LeftContent.add(new JLabel("Port:"));
    Left4.add(new JTextField(1));
    LeftContent.add(Left4);

    //RightContent
    RightContent.setBorder(BorderFactory.createTitledBorder("Dateien"));
    RightContent.add(new JLabel("Quelle:"));
    RightContent.add(new JTextField(7));
    RightContent.add(new JLabel("Ziel:"));
    RightContent.add(new JTextField(7));

    //ButtonPanel-South
    ButtonPanel.add(new JButton("OK"));
    ButtonPanel.add(new JButton("Cancel"));

    Window.pack();
  }
}
