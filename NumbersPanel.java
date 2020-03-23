package Package1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class NumbersPanel extends JPanel implements ActionListener {

	private char[] znakiNaPrzyciskach = {'1','2','3','4','5','6','7','8','9',' ','0',' '};
	private JButton[] tablicaPrzyciskow = new JButton[12];
	
	public NumbersPanel() {
		
		setLayout(new GridLayout(4, 3));												//ustawienie wygladu panelu 3 kolumny 4 wiersze
		
		for(int i = 0; i < 12; i++) {
			tablicaPrzyciskow[i] = new JButton(""+znakiNaPrzyciskach[i]);
			tablicaPrzyciskow[i].addActionListener(this);
			tablicaPrzyciskow[i].setBackground(Color.GRAY);
			add(tablicaPrzyciskow[i]);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object przycisk = e.getSource();
		
		for(int i = 0; i < 10; i++) {
			if(przycisk == tablicaPrzyciskow[i]) {
				
			}
		}
		
	}

}
