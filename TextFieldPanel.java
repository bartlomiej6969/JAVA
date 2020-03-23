package Package1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldPanel extends JPanel {

	JTextField textField;
	JLabel etykietaDzialania;
	
	Font textFieldFont;
	
	public TextFieldPanel() {
		
		 etykietaDzialania = new JLabel();
		 textField = new JTextField(30);
		 textFieldFont = new Font("Sans Serif", Font.BOLD,22);
		 textField.setFont(textFieldFont);
		 
		 add(etykietaDzialania);
		 add(textField);
	}
}
