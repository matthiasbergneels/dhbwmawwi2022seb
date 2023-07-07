package studentarea.excersises.chapter10;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class myItemListener implements ItemListener {
  private JTextField port;
  @Override
  public void itemStateChanged(ItemEvent e) {
    String item = (String) e.getItem();
  }
}
