package studentarea.excersises.chapter10.Uebung14;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Einwohnermeldeamt extends JFrame {

  private JLabel nameLabel;
  private JTextField nameTextField;
  private JLabel geburtsnameLabel;
  private JTextField geburtsnameTextField;

  private JLabel vornameLabel;
  private JTextField vornameTextField;

  private JLabel emailLabel;
  private JTextField emailTextField;

  private JComboBox<String> anredeCombobox;

  //Action commands
  private final String ACTION_COMMAND_LEDIG = "LEDIG";
  private final String ACTION_COMMAND_MARRIED = "VERHEIRATET";
  private final String ACTION_COMMAND_VERWITWET = "VERWITWET";
  private final String ACTION_COMMAND_GESCHIEDEN = "GESCHIEDEN";

  private final String ACTION_COMMAND_HINZUFUEGEN = "HINZUFUEGEN";
  private final String ACTION_COMMAND_ANZEIGEN = "ANZEIGEN";
  private final String ACTION_COMMAND_SUCHEN = "SUCHEN";
  private final String ACTION_COMMAND_LOESCHEN = "LOESCHEN";
  private final String ACTION_COMMAND_LISTEANZEIGEN = "LISTEANZEIGEN";

  private String familienstand = ACTION_COMMAND_MARRIED;


  public static void main(String[] args) {
    new Einwohnermeldeamt();
  }
    Einwohnermeldeamt(){
      super("Einwohnermeldeamt");
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);

      //buttons
      JPanel buttonPanel = createButtonPanel();
      buttonPanel.setLayout(new GridLayout(1,2));

      //content
      JPanel mainContent = new JPanel();
      mainContent.setLayout(new FlowLayout());
      JPanel kontaktdatenPanel = createKontaktDatenPanel();
      kontaktdatenPanel.setPreferredSize(new Dimension(300,150));
      JPanel marriedPanel = createMarriedStatePanel();

      mainContent.add(kontaktdatenPanel);
      mainContent.add(marriedPanel);

      this.getContentPane().add(mainContent, BorderLayout.CENTER);
      this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);


      this.pack();
      this.setVisible(true);
    }

  private JPanel createButtonPanel() {
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());

    JButton hinuefuegenButton = new JButton("Hinzufügen");
    JButton anzeigenButton = new JButton("Anzeigen");
    JButton suchenButton = new JButton("Suchen");
    JButton loeschenButton = new JButton("Löschen");
    JButton listeAnzeigenButton = new JButton("Liste anzeigen");

    hinuefuegenButton.setActionCommand(ACTION_COMMAND_HINZUFUEGEN);
    anzeigenButton.setActionCommand(ACTION_COMMAND_ANZEIGEN);
    suchenButton.setActionCommand(ACTION_COMMAND_SUCHEN);
    loeschenButton.setActionCommand(ACTION_COMMAND_LOESCHEN);
    listeAnzeigenButton.setActionCommand(ACTION_COMMAND_LISTEANZEIGEN);

    ActionListener buttonListener = e -> {
      Listenoperationen operationen = Listenoperationen.getInstance();

      String anrede = (String) this.anredeCombobox.getSelectedItem();
      String name = this.nameTextField.getText();
      String vorname = this.vornameTextField.getText();
      String geburtsname = this.geburtsnameTextField.getText();
      String email = this.emailTextField.getText();
g
      if(e.getActionCommand().equals(ACTION_COMMAND_HINZUFUEGEN)){
        operationen.hinzufuegen(anrede, name, vorname, geburtsname, email, familienstand);
      }

      if(e.getActionCommand().equals(ACTION_COMMAND_ANZEIGEN)){
        boolean success = operationen.anzeigen(name, vorname);
        if(!success){
          JOptionPane.showMessageDialog(this, "Einwohner existiert nicht");
        }
      }

      if(e.getActionCommand().equals(ACTION_COMMAND_SUCHEN)){
        if(operationen.suchen(name, vorname))
          JOptionPane.showMessageDialog(this, "Einwohner existiert");
        else
          JOptionPane.showMessageDialog(this, "Einwohner existiert nicht");
      }

      if(e.getActionCommand().equals(ACTION_COMMAND_LOESCHEN)){
        boolean success = operationen.loeschen(name, vorname);
        if(success)
          JOptionPane.showMessageDialog(this, "Einwohner gelöscht");
        else
          JOptionPane.showMessageDialog(this, "Einwohner existiert nicht");

      }

      if(e.getActionCommand().equals(ACTION_COMMAND_LISTEANZEIGEN))
        operationen.listeAusgeben();
    };


    hinuefuegenButton.addActionListener(buttonListener);
    anzeigenButton.addActionListener(buttonListener);
    suchenButton.addActionListener(buttonListener);
    loeschenButton.addActionListener(buttonListener);
    listeAnzeigenButton.addActionListener(buttonListener);


    buttonPanel.add(hinuefuegenButton);
    buttonPanel.add(anzeigenButton);
    buttonPanel.add(suchenButton);
    buttonPanel.add(loeschenButton);
    buttonPanel.add(listeAnzeigenButton);

    return buttonPanel;
  }

  private JPanel createKontaktDatenPanel() {
    Border kontaktdatenBorder = BorderFactory.createTitledBorder(new EtchedBorder(), "Kontaktdaten");

    JPanel kontaktdatenPanel = new JPanel();
    kontaktdatenPanel.setBorder(kontaktdatenBorder);
    kontaktdatenPanel.setLayout(new GridLayout(0,2)); //0 = any number of cols

    //add Elements
    kontaktdatenPanel.add(new JLabel("Anrede"));
    this.anredeCombobox = new JComboBox<String>(new String[]{"Frau", "Mann"});
    kontaktdatenPanel.add(this.anredeCombobox);

    this.nameLabel = new JLabel("Name");
    kontaktdatenPanel.add(this.nameLabel);
    this.nameTextField = new JTextField();
    kontaktdatenPanel.add(this.nameTextField);

    this.vornameLabel = new JLabel("Vorname");
    kontaktdatenPanel.add(this.vornameLabel);
    this.vornameTextField = new JTextField();
    kontaktdatenPanel.add(this.vornameTextField);

    this.geburtsnameLabel = new JLabel("Geburtsname");
    kontaktdatenPanel.add(this.geburtsnameLabel);
    this.geburtsnameTextField = new JTextField();
    kontaktdatenPanel.add(this.geburtsnameTextField);

    this.emailLabel = new JLabel("Email");
    kontaktdatenPanel.add(this.emailLabel);
    this.emailTextField = new JTextField();
    kontaktdatenPanel.add(this.emailTextField);

    return kontaktdatenPanel;
  }

  private JPanel createMarriedStatePanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(0,1));
    Border marriedPanelBorder = BorderFactory.createTitledBorder(new EtchedBorder(), "Kontaktdaten");
    panel.setBorder(marriedPanelBorder);

    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton ledigButton = new JRadioButton("ledig");
    ledigButton.setActionCommand(this.ACTION_COMMAND_LEDIG);
    JRadioButton verheiratetButton = new JRadioButton("verheiratet");
    verheiratetButton.setActionCommand(this.ACTION_COMMAND_MARRIED);
    JRadioButton verwitwetButton = new JRadioButton("verwitwet");
    verwitwetButton.setActionCommand(this.ACTION_COMMAND_VERWITWET);
    JRadioButton geschiedenButton = new JRadioButton("geschieden");
    geschiedenButton.setActionCommand(this.ACTION_COMMAND_GESCHIEDEN);

    buttonGroup.add(ledigButton);
    buttonGroup.add(verheiratetButton);
    buttonGroup.add(verwitwetButton);
    buttonGroup.add(geschiedenButton);

    ActionListener radioButtonListener = e -> {
      familienstand = e.getActionCommand();
      System.out.println(e);
      if(e.getActionCommand().equals(this.ACTION_COMMAND_LEDIG)){
        this.geburtsnameLabel.setEnabled(false);
        this.geburtsnameTextField.setText(this.nameTextField.getText());
        this.geburtsnameTextField.setEnabled(false);
      }else {
        this.geburtsnameLabel.setEnabled(true);
        this.geburtsnameTextField.setEnabled(true);
      }
    };

    ledigButton.addActionListener(radioButtonListener);
    verheiratetButton.addActionListener(radioButtonListener);
    verwitwetButton.addActionListener(radioButtonListener);
    geschiedenButton.addActionListener(radioButtonListener);

    verheiratetButton.setSelected(true);  //Standart button
    panel.add(ledigButton);
    panel.add(verheiratetButton);
    panel.add(verwitwetButton);
    panel.add(geschiedenButton);


    return panel;
  }
}
