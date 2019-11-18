//Gavin Swiger
//November 17th 2019
//COP2805C

import java.awt.*;
import java.util.Random;
import javax.swing.*;


public class onesAndZeros extends JApplet {
	
	public void init() {
		
		//Setting the title to match the Assignment Example
	    Frame title = (Frame)this.getParent().getParent();
	    title.setTitle("Matrix");
	    
	    //Write a applet program that displays a 10 – by – 10 square matrix
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(10, 10));
		
		for (int i = 0; i < 100; i++) {
			
			// Use TextField’s setText method to set value 0 or 1 as a string.
			JTextField textFieldRand = new JTextField();
			textFieldRand.setText(createText());
			
			//display each number centered in a text field.
			textFieldRand.setHorizontalAlignment(JTextField.CENTER);
			p1.add(textFieldRand);
			add(p1);
		}
		
	}
	
	public void start() {}
	
	public void stop() {}
	
	public void destroy() {}
	
	public static String createText() {
		
		//Each element in the matrix is zero or one, randomly generated
		Random random = new Random();
		int randomInteger = random.nextInt(2);
		
		return Integer.toString(randomInteger);
	}
}



