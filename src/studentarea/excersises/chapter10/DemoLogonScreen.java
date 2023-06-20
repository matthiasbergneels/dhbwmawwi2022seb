package studentarea.excersises.chapter10;

import javax.swing.*;
import javax.swing.border.Border;
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
    JPanel RightContent = new JPanel(new GridLayout(0, 1));


    Window.add(MainPanel);
    MainPanel.add(ContentPanel, BorderLayout.CENTER);
    MainPanel.add(ButtonPanel, BorderLayout.SOUTH);

    ContentPanel.add(LeftContent);
    ContentPanel.add(RightContent);

    LeftContent.add(new JButton("Text1"));
    LeftContent.add(new JButton("Text2"));
    LeftContent.add(new JButton("Text3"));
    LeftContent.add(new JButton("Text4"));

    RightContent.add(new JPanel());

    ButtonPanel.add(new JButton("OK"));
    ButtonPanel.add(new JButton("Cancel"));

    Window.pack();
  }
}
