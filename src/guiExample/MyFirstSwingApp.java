package guiExample;

import javax.swing.*;

public class MyFirstSwingApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing");

        JTextField textField = new JTextField();
        JButton button = new JButton("입력 확인");
        // 1. 텍스트필드와 버튼의 크기 및 위치 알아서 설정
        // 2. 버튼을 누르면 텍스트필드의 내용이 콘솔출력되게 하기
        // 힌트 : 텍스트필드.getText() 하면 내용 읽힘.

        textField.setBounds(100, 100, 85, 30);
        button.setBounds(200, 100, 95, 30);

        
        button.addActionListener(e -> {
            String str = new String(textField.getText());
            System.out.println(str);
        });

        frame.add(textField);
        frame.add(button);

        frame.setSize(400, 400); // 프레임 크기 설정
        frame.setLayout(null);
        frame.setVisible(true); // 프레임 보기 설정

    }

}
