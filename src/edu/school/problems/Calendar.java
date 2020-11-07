package edu.school.problems;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calendar {
	
	public static final int DAYS = 28;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame calendar = new JFrame();
		calendar.setBounds(10, 20, 1760, 1000);
		calendar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calendar.setLayout(null);
		
		JLabel lblMonday = new JLabel("Mon");
		calendar.add(lblMonday);
		lblMonday.setBounds(10, 10, 250, 10);
		
		JLabel lblTuesday = new JLabel("Tue");
		calendar.add(lblTuesday);
		lblTuesday.setBounds(260, 10, 250, 10);
		
		JLabel lblWednesday = new JLabel("Wed");
		calendar.add(lblWednesday);
		lblWednesday.setBounds(510, 10, 250, 10);
		
		JLabel lblThursday = new JLabel("Thu");
		calendar.add(lblThursday);
		lblThursday.setBounds(760, 10, 250, 10);
		
		JLabel lblFriday = new JLabel("Fri");
		calendar.add(lblFriday);
		lblFriday.setBounds(1010, 10, 250, 10);
		
		JLabel lblSaturday = new JLabel("Sat");
		calendar.add(lblSaturday);
		lblSaturday.setBounds(1260, 10, 250, 10);
		
		JLabel lblSunday = new JLabel("Sun");
		calendar.add(lblSunday);
		lblSunday.setBounds(1510, 10, 250, 10);
		
		JPanel[] pnlDay = new JPanel[DAYS];
		int width = 240;
		int height = 125;
		int x = 10;
		int y = 23;
		
		for(int i = 0; i < DAYS; i++) {
			pnlDay[i] = new JPanel();
			pnlDay[i].setBounds(x, y, width, height);
			if(x == 1510) {
				x = 10;
				y += 50;
			}
			else {
				x += 250;
			}
			pnlDay[i].setBackground(Color.darkGray);
			calendar.add(pnlDay[i]);
		}
		
		calendar.setVisible(true);

	}

}
