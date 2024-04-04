package guiExample;

import javax.swing.*;


public class ButtonExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("Click Here");
		b.setBounds(50,100,95,30);
		f.add(b);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
