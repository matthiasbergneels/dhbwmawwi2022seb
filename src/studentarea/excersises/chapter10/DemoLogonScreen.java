package studentarea.excersises.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class DemoLogonScreen extends JFrame {

  public DemoLogonScreen() {
    super(Strings.LOGON);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());

    JPanel connectionsPanel = createConnectionsPanel();
    JPanel filesPanel = createFilesPanel();

    JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 24, 12));
    centerPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
    centerPanel.add(connectionsPanel);
    centerPanel.add(filesPanel);

    JPanel bottomPanel = new JPanel(new FlowLayout());
    bottomPanel.add(new JButton(Strings.ACCEPT));
    bottomPanel.add(new JButton(Strings.DECLINE));

    this.add(centerPanel, BorderLayout.CENTER);
    this.add(bottomPanel, BorderLayout.SOUTH);

    this.pack();
    this.setVisible(true);
  }

  private JPanel createFilesPanel() {
    JPanel filesPanel = new JPanel(new GridLayout(0, 2));
    filesPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), Strings.FILES));
    filesPanel.add(new JLabel(Strings.SOURCE));
    filesPanel.add(createLeftFlowPanelWithSingle(new JTextField(8)));
    filesPanel.add(new JLabel(Strings.DESTINATION));
    filesPanel.add(createLeftFlowPanelWithSingle(new JTextField(8)));
    return filesPanel;
  }

  private JPanel createConnectionsPanel() {
    JPanel connectionsPanel = new JPanel(new GridLayout(0, 2));
    connectionsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), Strings.CONNECTIONS));
    connectionsPanel.add(new JLabel(Strings.USER));
    connectionsPanel.add(createLeftFlowPanelWithSingle(new JTextField(3)));
    connectionsPanel.add(new JLabel(Strings.PASSWORD));
    connectionsPanel.add(createLeftFlowPanelWithSingle(new JTextField(5)));
    connectionsPanel.add(new JLabel(Strings.TYPE));
    connectionsPanel.add(createLeftFlowPanelWithSingle(new JComboBox<>(Strings.ITEMS)));
    connectionsPanel.add(new JLabel(Strings.HOST));
    connectionsPanel.add(createLeftFlowPanelWithSingle(new JTextField(5)));
    connectionsPanel.add(new JLabel(Strings.PORT));
    connectionsPanel.add(createLeftFlowPanelWithSingle(new JTextField(1)));
    return connectionsPanel;
  }

  private JPanel createLeftFlowPanelWithSingle(Component component) {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    panel.add(component);
    return panel;
  }

  public static void main(String[] args) {
    new DemoLogonScreen();
  }

  private static class Strings {

    public static final String LOGON = "Logon";
    public static final String ACCEPT = "OK";
    public static final String DECLINE = "Cancel";
    public static final String CONNECTIONS = "Verbindungen";
    public static final String FILES = "Dateien";
    public static final String USER = "User:";
    public static final String PASSWORD = "Passwort:";
    public static final String TYPE = "Art:";
    public static final String[] ITEMS = {"FTP", "SFTP", "HTTP", "HTTPS"};
    public static final String HOST = "Host:";
    public static final String PORT = "Port:";
    public static final String SOURCE = "Quelle:";
    public static final String DESTINATION = "Ziel:";

  }
}
