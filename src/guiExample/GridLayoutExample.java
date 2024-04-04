package guiExample;

import javax.swing.*;
import java.awt.*;

class GridLayoutEx {
    JFrame f;
    GridLayoutEx() {
        f = new JFrame("Title");
        JLabel lb1 = new JLabel("1");
        JLabel lb2 = new JLabel("2");
        JLabel lb3 = new JLabel("3");
        JLabel lb4 = new JLabel("4");

        lb1.setHorizontalAlignment(JLabel.CENTER);
        lb2.setHorizontalAlignment(JLabel.CENTER);
        lb3.setHorizontalAlignment(JLabel.CENTER);
        lb4.setHorizontalAlignment(JLabel.CENTER);

        f.add(lb1);
        f.add(lb2);
        f.add(lb3);
        f.add(lb4);

        f.setLayout(new GridLayout(2, 2));

        f.setSize(160, 160);
        f.setVisible(true);

    }

}

public class GridLayoutExample {
    public static void main(String[] args) {
        new GridLayoutEx();

    }
}
