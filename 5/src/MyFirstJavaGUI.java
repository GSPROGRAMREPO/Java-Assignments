//Gavin Swiger
//Advanced Java
//October 11, 2019

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstJavaGUI {
	
	static JTextField textField;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("This is frame title.");
		
		JPanel panel = new JPanel();	
		panel.setLayout(new BorderLayout());
		
		JPanel panel2 = new JPanel();	
		panel2.setLayout(new BorderLayout());
		
		//Construct four text fields, text field one with 10 columns
		textField = new JTextField();
		textField.setColumns(10);
		textField.setName("textField1");
		//When user types in any text field or password field, then presses Enter, an event occurs.
		//Create an inner class for even handling then instantiate an object from the inner class.
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input = textField.getText();
					JOptionPane.showMessageDialog(null, textField.getName() + ": " + input);
				}catch(Exception e1) {
					System.out.println("Something went wrong.");
				}
			}
		});
		
		//text field two with default text
		JTextField textField2 = new JTextField("Enter text here");
		textField2.setPreferredSize(new Dimension(150, 20));
		textField2.setName("textField2");
		textField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input = textField2.getText();
					JOptionPane.showMessageDialog(null, textField2.getName() + ": " + input);
				}catch(Exception e1) {
					System.out.println("Something went wrong.");
				}
			}
		});
		
		//text field three with default text and 21 columns
		JTextField textField3 = new JTextField("Uneditable text field");
		textField3.setColumns(21);
		textField3.setName("textField3");
		textField3.setEditable(false);
		
		//password field with default text.
		JTextField textField4 = new JPasswordField("Default text");
		textField4.setPreferredSize(new Dimension(120, 20));
		textField4.setName("passwordField");
		textField4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String input = textField4.getText();
					JOptionPane.showMessageDialog(null, textField4.getName() + ": hidden text");
				}catch(Exception e1) {
					System.out.println("Something went wrong.");
				}
			}
		});
		

		panel.add(textField,BorderLayout.WEST);
		panel.add(textField2, BorderLayout.EAST);
		
		panel2.add(textField3,BorderLayout.WEST);
		panel2.add(textField4, BorderLayout.EAST);

		
		//Add all the above text fields to JFrame.
		frame.add(panel, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(375,90);
	}

}
