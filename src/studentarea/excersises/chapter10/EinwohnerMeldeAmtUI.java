package studentarea.excersises.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class EinwohnerMeldeAmtUI extends JFrame {

  private final String ACTION_COMMAND_ADD = "Add";
  private final String ACTION_COMMAND_SHOW = "Show";
  private final String ACTION_COMMAND_SEARCH = "Search";
  private final String ACTION_COMMAND_DELETE = "Delete";
  private final String ACTION_COMMAND_SHOW_LIST = "Show List";
  private final String ACTION_COMMAND_SINGLE = "ledig";
  private final String ACTION_COMMAND_MARRIED = "verheiratet";
  private final String ACTION_COMMAND_WIDOW = "verwittwet";
  private final String ACTION_COMMAND_DIVORCED = "geschieden";

  private ListOperations listOpertions = new ListOperations();
  private EinwohnerMeldeAmtUI() {

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Einwohnermeldeamt");

    JPanel topPanel = new JPanel(new FlowLayout());
    JPanel centerPanel = new JPanel(new FlowLayout());
    JPanel bottomPanel = new JPanel(new FlowLayout());

    JLabel messageText = new JLabel("Erfolgreich gestartet");
    topPanel.add(messageText);


    centerPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));


    JPanel contacts = new JPanel(new GridLayout(0,2));
    contacts.setBorder(BorderFactory.createTitledBorder("Kontaktinformationen"));

    FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);


    JComboBox anredeComboBox = new JComboBox<>(new String[]{"Herr", "Frau", "---"});
    JTextField nameField = new JTextField(15);
    nameField.setText("Mustermann");
    JTextField firstNameField = new JTextField(15);
    firstNameField.setText("Max");
    JTextField birthNameField = new JTextField(15);
    birthNameField.setText("Doe");
    JTextField eMailField = new JTextField(15);
    eMailField.setText("max.mustermann@gmx.de");

    JPanel flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("Anrede"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(anredeComboBox);
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("Name"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell =new JPanel(cellFlowLayout);
    flowlayoutForCell.add(nameField);
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("Vorname"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell =new JPanel(cellFlowLayout);
    flowlayoutForCell.add(firstNameField);
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("Geburtsname"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell =new JPanel(cellFlowLayout);
    flowlayoutForCell.add(birthNameField);
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("E-Mail"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell =new JPanel(cellFlowLayout);
    flowlayoutForCell.add(eMailField);
    contacts.add(flowlayoutForCell);

    JPanel familySituation = new JPanel(new GridLayout(0,1));

    JRadioButton singleRadioButton = new JRadioButton("ledig");
    singleRadioButton.setActionCommand(ACTION_COMMAND_SINGLE);
    singleRadioButton.setSelected(true);
    JRadioButton marriedRadioButton = new JRadioButton("verheiratet");
    marriedRadioButton.setActionCommand(ACTION_COMMAND_MARRIED);
    JRadioButton widowRadioButton = new JRadioButton("verwittwet");
    widowRadioButton.setActionCommand(ACTION_COMMAND_WIDOW);
    JRadioButton divorcedRadioButton = new JRadioButton("geschieden");
    divorcedRadioButton.setActionCommand(ACTION_COMMAND_DIVORCED);

    ButtonGroup radiobuttonGroup = new ButtonGroup();
    radiobuttonGroup.add(singleRadioButton);
    radiobuttonGroup.add(marriedRadioButton);
    radiobuttonGroup.add(widowRadioButton);
    radiobuttonGroup.add(divorcedRadioButton);



    familySituation.setBorder(BorderFactory.createTitledBorder("Familienstand"));
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(singleRadioButton);
    familySituation.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(marriedRadioButton);
    familySituation.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(widowRadioButton);
    familySituation.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(divorcedRadioButton);
    familySituation.add(flowlayoutForCell);

    ActionListener radioButtonListener = e -> {
        if(e.getActionCommand().equals(ACTION_COMMAND_SINGLE)){
          birthNameField.setText(nameField.getText());
          birthNameField.setEditable(false);
        }
        else{
          birthNameField.setText("Doe");
          birthNameField.setVisible(true);
        }
    };

    singleRadioButton.addActionListener(radioButtonListener);
    marriedRadioButton.addActionListener(radioButtonListener);
    widowRadioButton.addActionListener(radioButtonListener);
    divorcedRadioButton.addActionListener(radioButtonListener);



    centerPanel.add(contacts);
    centerPanel.add(familySituation);
    JButton addButton = new JButton("Hinzufügen");
    addButton.setActionCommand(ACTION_COMMAND_ADD);
    JButton showButton = new JButton("Anzeigen");
    showButton.setActionCommand(ACTION_COMMAND_SHOW);
    JButton searchButton = new JButton("Suchen");
    searchButton.setActionCommand(ACTION_COMMAND_SEARCH);
    JButton deleteButton = new JButton("Löschen");
    deleteButton.setActionCommand(ACTION_COMMAND_DELETE);
    JButton showListButton = new JButton("Liste anzeigen");
    showListButton.setActionCommand(ACTION_COMMAND_SHOW_LIST);

    ActionListener buttonListener = e -> {



      if(e.getActionCommand().equals(ACTION_COMMAND_ADD)){
          if(listOpertions.add(
            anredeComboBox.getSelectedItem().toString(),
            nameField.getText(),
            firstNameField.getText(),
            birthNameField.getText(),
            eMailField.getText(),
            radiobuttonGroup.getSelection().getActionCommand()
          )){
            messageText.setText("Einwohner hinzugefügt");
          }
          else{
            messageText.setText("Einwohner existiert schon");
          };
      }

      if(e.getActionCommand().equals(ACTION_COMMAND_SHOW)){
        if(listOpertions.show(nameField.getText(), firstNameField.getText())){
          messageText.setText("Einwohner in Konsole angezeigt");
        }
        else{
          messageText.setText("Einwohner nicht gefunden");
        }
      }

      if(e.getActionCommand().equals(ACTION_COMMAND_SEARCH)){
        if(listOpertions.search(nameField.getText(), firstNameField.getText())){
          messageText.setText("Einwohner gefunden");
        }
        else{
          messageText.setText("Einwohner nicht gefunden");
        }
      }

      if(e.getActionCommand().equals(ACTION_COMMAND_DELETE)){
        if(listOpertions.delete(nameField.getText(), firstNameField.getText())){
          messageText.setText("Einwohner erfolgreich gelöscht");
        }
        else{
          messageText.setText("Enwohner nicht gefunden");
        }
      }

      if(e.getActionCommand().equals(ACTION_COMMAND_SHOW_LIST)){
        listOpertions.showList();
        messageText.setText("Alle Einwohner in Konsole ausgegeben");
      }
    };

    addButton.addActionListener(buttonListener);
    showButton.addActionListener(buttonListener);
    searchButton.addActionListener(buttonListener);
    deleteButton.addActionListener(buttonListener);
    showListButton.addActionListener(buttonListener);

    bottomPanel.add(addButton);
    bottomPanel.add(showButton);
    bottomPanel.add(searchButton);
    bottomPanel.add(deleteButton);
    bottomPanel.add(showListButton);

    this.add(topPanel, BorderLayout.NORTH);
    this.add(centerPanel, BorderLayout.CENTER);
    this.add(bottomPanel, BorderLayout.SOUTH);

    this.pack();
    this.setVisible(true);

  }



  public static void main(String[] args) {
    EinwohnerMeldeAmtUI ui = new EinwohnerMeldeAmtUI();
  }

}
