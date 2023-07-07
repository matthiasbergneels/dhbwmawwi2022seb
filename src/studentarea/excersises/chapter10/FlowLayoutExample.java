package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    private FlowLayoutExample(){
        super();
        this.setTitle("FlowLayoutExample");

        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.add(new JLabel("Text 1"));
        this.add(new JLabel("Text 2"));
        this.add(new JLabel("Text 3"));
        this.add(new JLabel("Text 4"));
        this.add(new JLabel("Text 5"));
        this.add(new JLabel("Text 6"));
        this.add(new JLabel("Text 7"));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }

}
