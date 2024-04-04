package guiExample;

import javax.swing.*;
import java.awt.*;

/*
 * 그리드레이아웃을 이용해 2행 2열 레이아웃을 가진 창을 만들어보자.
 * 창 안에는 텍스트필드, 버튼, 텍스트필드, 버튼 순서로 요소를 추가하자.
 * 첫 번째 버튼을 클릭하면 첫 번째 텍스트 필드의 내용이
 * 두 번째 버튼을 클릭하면 두 번째 텍스트 필드의 내용이
 * 출력되는 메시지박스를 만들어 보자!
*/

class QGridLayout {
    JFrame f;

    QGridLayout() {
        f = new JFrame("Title");
        JButton btn1 = new JButton("1 버튼");
        JButton btn2 = new JButton("2 버튼");
        JTextField tf1 = new JTextField("");
        JTextField tf2 = new JTextField("");

        btn1.setHorizontalAlignment(JLabel.CENTER);
        btn2.setHorizontalAlignment(JLabel.CENTER);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf2.setHorizontalAlignment(JTextField.CENTER);

        f.add(tf1);
        f.add(btn1);
        f.add(tf2);
        f.add(btn2);

        btn1.addActionListener(e -> {
            String str1 = new String(tf1.getText());
            JOptionPane.showMessageDialog(null, str1, str1, JOptionPane.INFORMATION_MESSAGE);

        });

        btn2.addActionListener(e -> {
            String str2 = new String(tf2.getText());
            JOptionPane.showMessageDialog(null, str2, str2, JOptionPane.WARNING_MESSAGE);
        });

        f.setLayout(new GridLayout(2, 2));
        f.setSize(400, 300);
        f.setVisible(true);

    }

}

public class MySecondSwingApp {
    public static void main(String[] args) {
        new QGridLayout();

    }
}
