package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Name = JOptionPane.showInputDialog(null, "What is your name?");
		// 2. Ask the user to enter a name. Store their answer in a variable.
		if (Name.equals("Daniel")) {
			JOptionPane.showMessageDialog(null,"Daniel's zodiac sign is Virgo");
		}
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (Name.equals("Harry")) {
			JOptionPane.showMessageDialog(null,"Did you know that your nickname has an actual definition?");
		}
		if(Name.equals("Timmy")) {
			JOptionPane.showMessageDialog(null,"According to the Urban Dictionary, you might be that "
					+ "one kid to break something at the party.");
		}
	}
}

