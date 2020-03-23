package Package1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class CalcWindow {
	
	JFrame window;
	JPanel textFieldPanel = new TextFieldPanel();
	JPanel numbersPanel = new NumbersPanel();
	JPanel operationsPanel = new OperationsPanel();
	JPanel mainPanel = new JPanel();
	
	public CalcWindow() {
		window = new JFrame("Kalkulator");
	
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600, 600);
		window.setResizable(false);
		window.setVisible(true);
		window.setLayout(null);

		mainPanel.setLayout(new GridLayout(1, 2));
		mainPanel.add(numbersPanel);
		mainPanel.add(operationsPanel);
		
		textFieldPanel.setBounds(0, 0, 600, 50);
		mainPanel.setBounds(0, 50, 600, 500);
		window.add(textFieldPanel);
		window.add(mainPanel);
	}
}
