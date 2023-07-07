package lecture.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicReference;

public class EinwohnerScreen extends JFrame {

  String[] ANREDEN = {"Frau", "Herr", "---"};
  public static String ACTION_COMMAND_LEDIG = "ledig";
  public static String ACTION_COMMAND_HINZUFUEGEN = "hinzufuguen";
  public static String ACTION_COMMAND_ANZEIGEN = "anzeigen";
  public static String ACTION_COMMAND_SUCHEN = "suchen";
  public static String ACTION_COMMAND_LOESCHEN = "loeschen";
  public static String ACTION_COMMAND_LISTE_ANZEIGEN = "listeAnzeigen";

  public EinwohnerScreen(){

    super("Einwohnermeldeamt");
    Listenoperationen listenoperationen = new Listenoperationen();
    AtomicReference<String> selectedFamilienstand = new AtomicReference<>("ledig");

    JLabel einwohnerHinzugefügt = new JLabel();
    this.add(einwohnerHinzugefügt, BorderLayout.NORTH);

    // Center Panel
    JPanel centerPanel = new JPanel(new FlowLayout());

    centerPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

    // Kontaktdaten Panel
    JPanel kontaktdaten = new JPanel(new GridLayout(0, 2));
    kontaktdaten.setBorder(BorderFactory.createTitledBorder("Kontaktdaten"));

    kontaktdaten.add(new JLabel("Anrede"));
    JComboBox<String> anrede = new JComboBox<>(ANREDEN);
    kontaktdaten.add(anrede);
    kontaktdaten.add(new JLabel("Name"));
    JTextField name = new JTextField(10);
    kontaktdaten.add(name);

    kontaktdaten.add(new JLabel("Vorname"));
    JTextField vorname = new JTextField();
    kontaktdaten.add(vorname);
    JLabel geburtsnameLabel = new JLabel("Geburtsname");
    //kontaktdaten.add(geburtsnameLabel);
    JTextField geburtsname = new JTextField();
    //kontaktdaten.add(geburtsname);
    kontaktdaten.add(new JLabel("E-Mail"));
    JTextField email = new JTextField();
    kontaktdaten.add(email);

    centerPanel.add(kontaktdaten);

    // Familien Stand
    JPanel familienStand = new JPanel(new GridLayout(0, 1));

    ActionListener familienStandAuswahl = e -> {
      selectedFamilienstand.set(e.getActionCommand());
      if(e.getActionCommand().equals(ACTION_COMMAND_LEDIG)){
        kontaktdaten.remove(6);
        kontaktdaten.remove(6);
      }else{
        kontaktdaten.add(geburtsnameLabel, 6);
        kontaktdaten.add(geburtsname, 7);
      }
      kontaktdaten.revalidate();
      kontaktdaten.repaint();
      this.pack();
    };

    familienStand.setBorder(BorderFactory.createTitledBorder("Familienstand"));

    ButtonGroup radioButtons = new ButtonGroup();


    JRadioButton ledig = new JRadioButton("ledig", true);
    ledig.setActionCommand(ACTION_COMMAND_LEDIG);
    ledig.addActionListener(familienStandAuswahl);
    JRadioButton verheiratet = new JRadioButton("verheiratet");
    verheiratet.addActionListener(familienStandAuswahl);
    JRadioButton verwitwet = new JRadioButton("verwitwet");
    verwitwet.addActionListener(familienStandAuswahl);
    JRadioButton geschieden = new JRadioButton("geschieden");
    geschieden.addActionListener(familienStandAuswahl);

    radioButtons.add(ledig);
    radioButtons.add(verheiratet);
    radioButtons.add(verwitwet);
    radioButtons.add(geschieden);
    familienStand.add(ledig);
    familienStand.add(verheiratet);
    familienStand.add(verwitwet);
    familienStand.add(geschieden);

    centerPanel.add(familienStand);

    this.add(centerPanel);
    JPanel buttons = new JPanel(new FlowLayout());

    ActionListener buttonBarListener = e -> {
      String actionCommand = e.getActionCommand();
      System.out.println(actionCommand);

      if(actionCommand.equals(ACTION_COMMAND_HINZUFUEGEN)){
        listenoperationen.hinzufuegen(anrede.getSelectedItem().toString(), name.getText(), vorname.getText(), geburtsname.getText(), email.getText(), selectedFamilienstand.get());
      }else if(actionCommand.equals(ACTION_COMMAND_ANZEIGEN)){
        listenoperationen.anzeigen(name.getText(), vorname.getText());

      }else if(actionCommand.equals(ACTION_COMMAND_SUCHEN)){
        System.out.println(listenoperationen.suchen(name.getText(), vorname.getText()) ? "Der Einwohner wurde gefunden" : "Der Einwohner existiert nicht");
      }else if(actionCommand.equals(ACTION_COMMAND_LOESCHEN)){
        System.out.println(listenoperationen.loeschen(name.getText(), vorname.getText()) ? "Es wurde der Einwohner gelsöcht" : "Es wurde kein Einwohner gelöscht");
      }else if(actionCommand.equals(ACTION_COMMAND_LISTE_ANZEIGEN)){
        listenoperationen.listAusgeben();
      }
    };

    JButton add = new JButton("Hinzufügen");
    add.addActionListener(buttonBarListener);
    add.setActionCommand(ACTION_COMMAND_HINZUFUEGEN);
    add.setToolTipText("Einwohner hinzufügen");
    JButton display = new JButton("Anzeigen");
    display.addActionListener(buttonBarListener);
    display.setActionCommand(ACTION_COMMAND_ANZEIGEN);
    JButton search = new JButton("Suchen");
    search.addActionListener(buttonBarListener);
    search.setActionCommand(ACTION_COMMAND_SUCHEN);
    JButton delete = new JButton("Löschen");
    delete.addActionListener(buttonBarListener);
    delete.setActionCommand(ACTION_COMMAND_LOESCHEN);
    JButton showList = new JButton("Liste Anzeigen");
    showList.setActionCommand(ACTION_COMMAND_LISTE_ANZEIGEN);
    showList.addActionListener(buttonBarListener);


    buttons.add(add);
    buttons.add(display);
    buttons.add(search);
    buttons.add(delete);
    buttons.add(showList);

    // create menu Bar
    MenuBar menuBar = new MenuBar();
    Menu menu = new Menu("Optionen");

    MenuItem hinzufügenItem = new MenuItem("Hinzufügen");
    hinzufügenItem.addActionListener(buttonBarListener);
    hinzufügenItem.setActionCommand(ACTION_COMMAND_HINZUFUEGEN);
    MenuItem anzeigenItem = new MenuItem("Anzeigen");
    anzeigenItem.addActionListener(buttonBarListener);
    anzeigenItem.setActionCommand(ACTION_COMMAND_ANZEIGEN);
    MenuItem suchenItem = new MenuItem("Suchen");
    suchenItem.addActionListener(buttonBarListener);
    suchenItem.setActionCommand(ACTION_COMMAND_SUCHEN);
    MenuItem loeschenItem = new MenuItem("Löschen");
    loeschenItem.addActionListener(buttonBarListener);
    loeschenItem.setActionCommand(ACTION_COMMAND_LOESCHEN);
    MenuItem listeAnzeigenItem = new MenuItem("Liste Anzeigen");
    listeAnzeigenItem.addActionListener(buttonBarListener);
    listeAnzeigenItem.setActionCommand(ACTION_COMMAND_LISTE_ANZEIGEN);

    menu.add(hinzufügenItem);
    menu.add(anzeigenItem);
    menu.add(suchenItem);
    menu.add(loeschenItem);
    menu.add(listeAnzeigenItem);

    menuBar.add(menu);

    this.setMenuBar(menuBar);





    this.add(buttons, BorderLayout.SOUTH);

    this.setVisible(true);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }



  public static void main(String[] args) {
    new EinwohnerScreen();
  }
}
