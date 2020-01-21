package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
	String date= JOptionPane.showInputDialog(null,"When is your birthday?");
	if (date.equals("11/19")) {
		JOptionPane.showMessageDialog(null,"Happy Birthday!");
		
	}
else {
	JOptionPane.showMessageDialog(null,"Happy Unbirthday!");
	}		
	}
}
