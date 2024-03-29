package lecture.chapter10;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;


import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Logon extends JFrame {

  private static final String ACTION_COMMAND_OK = "OK";
  private static final String ACTION_COMMAND_CLOSE = "CLOSE";
  private static final String ACTION_COMMAND_PRINT = "PRINT";

  public Logon() throws ParseException {
    super();
    this.setTitle("Logon");
    this.setAlwaysOnTop(true);
    this.setName("Logon");
    this.setResizable(false);
    // this.setUndecorated(true);
    // this.setOpacity(0.5f);

    final String[] PROTOCOL_VALUE_HELP = {"FTP", "Telnet", "SMTP", "HTTP"};
    JComboBox<String> myComboBox = new JComboBox<>(PROTOCOL_VALUE_HELP);

    JFormattedTextField portField = new JFormattedTextField(new MaskFormatter("#####"));
    portField.setColumns(3);

    //myComboBox.addItemListener(new DropDownBoxItemListener(portField));
    myComboBox.addItemListener(e -> {
      System.out.println("Item: " + e.getItem());
      System.out.println("Status Änderung: " + e.getStateChange());
      System.out.println("Parameter: " + e.paramString());

      if(e.getStateChange() == ItemEvent.SELECTED){
        if(e.getItem().equals("HTTP")){
          portField.setText("80");
        } else if(e.getItem().equals("FTP")){
          portField.setText("21");
        }
      }
    });


     /*
    myComboBox.addActionListener(e -> {
      System.out.println("Action Command: " + e.getActionCommand());
      System.out.println("Modifiers: " + e.getModifiers());
      System.out.println("Parameter: " + e.paramString());

      JComboBox<String> comboBoxSource  = (JComboBox<String>) e.getSource();
      String currentItem = (String)comboBoxSource.getSelectedItem();

      if(currentItem.equals("FTP")){
        portField.setText("21");
      }else if(currentItem.equals("HTTP")){
        portField.setText("80");
      }

    });
     */

    // initialize Panels
    JPanel mainPanel = new JPanel(new BorderLayout());

    JPanel southPanel = new JPanel(new FlowLayout());
    JPanel centerPanel = new JPanel(new FlowLayout());

    JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
    JPanel filePanel = new JPanel(new GridLayout(0, 2));

    FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

    //create & assign elements for connection area
    JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("User:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(3));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Passwort:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JPasswordField(5));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Art:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(myComboBox);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Host:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    JTextField host = new JTextField(5);
    flowLayoutForCell.add(host);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Port:"));
    connectionPanel.add(flowLayoutForCell);

    connectionPanel.add(portField);

    // create & add Fields for File Area
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Quelle:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Ziel:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);

    // create & assign Buttons
    JButton okButton = new JButton("Ok");
    okButton.setActionCommand(ACTION_COMMAND_OK);
    JButton cancelButton = new JButton("Schließen");
    cancelButton.setActionCommand(ACTION_COMMAND_CLOSE);
    JButton printButton = new JButton("Ausgabe");
    printButton.setActionCommand(ACTION_COMMAND_PRINT);

    ActionListener actionButtonListener = e -> {
      System.out.println("Action Command: " + e.getActionCommand());
      System.out.println("Modifiers: " + e.getModifiers());
      System.out.println("Parameter: " + e.paramString());

      if(e.getActionCommand().equals(ACTION_COMMAND_CLOSE)){
        System.exit(0);
      }else if(e.getActionCommand().equals(ACTION_COMMAND_PRINT)){
        System.out.println("Port: " + portField.getText());
      }
    };

    MouseListener buttonMouseListener = new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
      }

      @Override
      public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");

      }

      @Override
      public void mouseReleased(MouseEvent e) {
        System.out.println("Released");
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");
        ((JButton)e.getSource()).setEnabled(false);
      }

      @Override
      public void mouseExited(MouseEvent e) {
        System.out.println("Exited");
        ((JButton)e.getSource()).setEnabled(true);
      }
    };

    okButton.addMouseListener(buttonMouseListener);

    okButton.addActionListener(actionButtonListener);
    cancelButton.addActionListener(actionButtonListener);
    printButton.addActionListener(actionButtonListener);

    southPanel.add(okButton);
    southPanel.add(cancelButton);
    southPanel.add(printButton);

    // create & assign Borders
    Border etchedBorder = BorderFactory.createEtchedBorder();
    Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
    Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
    Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

    connectionPanel.setBorder(connectionBorder);
    filePanel.setBorder(fileBorder);
    centerPanel.setBorder(centerBorder);

    // combine Panels
    centerPanel.add(connectionPanel);
    centerPanel.add(filePanel);

    mainPanel.add(centerPanel, BorderLayout.CENTER);
    mainPanel.add(southPanel, BorderLayout.SOUTH);

    this.add(mainPanel);

    JMenuBar jMenuBar = new JMenuBar();
    JMenu jFileMenu = new JMenu("File");
    JMenuItem jMenuItemClose = new JMenuItem("Beenden");
    jMenuItemClose.setActionCommand(ACTION_COMMAND_CLOSE);
    jMenuItemClose.addActionListener(actionButtonListener);
    JMenuItem jMenuItemPrint = new JMenuItem("Ausgeben");
    jMenuItemPrint.setActionCommand(ACTION_COMMAND_PRINT);
    jMenuItemPrint.addActionListener(actionButtonListener);

    jFileMenu.add(jMenuItemPrint);
    jFileMenu.add(jMenuItemClose);

    jMenuBar.add(jFileMenu);
    this.setJMenuBar(jMenuBar);

    MenuBar AwtMenuBar = new MenuBar();
    Menu awtFileMenu = new Menu("File");
    MenuItem awtCloseMenuItem = new MenuItem("Beenden");
    awtCloseMenuItem.setActionCommand(ACTION_COMMAND_CLOSE);
    awtCloseMenuItem.addActionListener(actionButtonListener);

    awtFileMenu.add(awtCloseMenuItem);
    AwtMenuBar.add(awtFileMenu);
    this.setMenuBar(AwtMenuBar);

    // set JFrame behavior
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) throws ParseException, UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

    // Set cross-platform Java L&F (also called "Metal")
    // UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

    GraphicsDevice defaultScreenDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

    System.out.println(String.format("Screen Dimension: %.0f x %.0f",
      defaultScreenDevice.getDefaultConfiguration().getBounds().getWidth(),
      defaultScreenDevice.getDefaultConfiguration().getBounds().getHeight()));

    new Logon();

    GraphicsEnvironment virtualGraphicsEvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] screens = virtualGraphicsEvironment.getScreenDevices();

    for(GraphicsDevice screen : screens){
      System.out.println(screen);
      System.out.println(screen.getDefaultConfiguration());
      System.out.println(screen.getDisplayMode());
      System.out.println(screen.getDefaultConfiguration().getBounds());
      System.out.println(screen.getDefaultConfiguration().getBounds().getWidth() + " x " + screen.getDefaultConfiguration().getBounds().getHeight());
      System.out.println(screen.getDefaultConfiguration().getBounds().getX() + " / " + screen.getDefaultConfiguration().getBounds().getY());
    }
  }
}