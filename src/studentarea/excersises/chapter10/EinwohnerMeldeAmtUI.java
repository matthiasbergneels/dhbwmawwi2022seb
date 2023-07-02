package studentarea.excersises.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.util.concurrent.Flow;

public class EinwohnerMeldeAmtUI extends JFrame {

  private EinwohnerMeldeAmtUI() {

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Einwohnermeldeamt");

    JPanel topPanel = new JPanel(new FlowLayout());
    JPanel centerPanel = new JPanel(new FlowLayout());
    JPanel bottomPanel = new JPanel(new FlowLayout());

    centerPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));


    JPanel contacts = new JPanel(new GridLayout(0,2));
    contacts.setBorder(BorderFactory.createTitledBorder("Kontaktinformationen"));

    FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

    JPanel flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("Anrede"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JComboBox<>(new String[]{"Herr", "Frau", "---"} ));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("Name"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell =new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JTextField(6));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("Vorname"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell =new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JTextField(6));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("Geburtsname"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell =new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JTextField(6));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JLabel("E-Mail"));
    contacts.add(flowlayoutForCell);
    flowlayoutForCell =new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JTextField(6));
    contacts.add(flowlayoutForCell);

    JPanel familySituation = new JPanel(new GridLayout(0,1));

    familySituation.setBorder(BorderFactory.createTitledBorder("Familienstand"));
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JRadioButton());
    flowlayoutForCell.add(new JLabel("ledig"));
    familySituation.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JRadioButton());
    flowlayoutForCell.add(new JLabel("verheiratet"));
    familySituation.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JRadioButton());
    flowlayoutForCell.add(new JLabel("verwittwet"));
    familySituation.add(flowlayoutForCell);
    flowlayoutForCell = new JPanel(cellFlowLayout);
    flowlayoutForCell.add(new JRadioButton());
    flowlayoutForCell.add(new JLabel("geschieden"));
    familySituation.add(flowlayoutForCell);

    centerPanel.add(contacts);
    centerPanel.add(familySituation);
    JButton addButton = new JButton("Hinzufügen");
    JButton showButton = new JButton("Anzeigen");
    JButton searchButton = new JButton("Suchen");
    JButton deleteButton = new JButton("Löschen");
    JButton showListButton = new JButton("Liste anzeigen");

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
