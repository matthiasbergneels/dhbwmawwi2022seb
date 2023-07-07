package studentarea.lecture.chapter10;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DropDownBoxItemListener implements ItemListener {

  private JFormattedTextField port;

  DropDownBoxItemListener(JFormattedTextField port) {
   this.port = port;
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    System.out.println("Item: " + e.getItem());
    System.out.println("Status Änderung" + e.getStateChange());
    System.out.println("Parameter: " + e.paramString());

    if (e.getStateChange() == ItemEvent.SELECTED) {
      if (e.getItem().equals("HTTP")) {
        port.setText("80");
      }
      if (e.getItem().equals("HTTP")) {
        port.setText("80");
      }
    }
  }
}
