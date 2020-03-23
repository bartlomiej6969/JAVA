package Package1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OperationsPanel extends JPanel implements ActionListener{

	private JButton[] tablicaPrzyciskow = new JButton[5];
	private char[] znakiNaPrzyciskach = {'+','-','*','/','='};
	
	public OperationsPanel() {
		setLayout(new GridLayout(5,1));
		
		for(int i = 0; i < 5; i++) {
			tablicaPrzyciskow[i] = new JButton("" + znakiNaPrzyciskach[i]);
			tablicaPrzyciskow[i].addActionListener(this);
			add(tablicaPrzyciskow[i]);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
