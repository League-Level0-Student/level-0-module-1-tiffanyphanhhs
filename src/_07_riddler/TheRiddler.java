package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		 int score = 0; 
		 String mathTeacher = "Math Teacher"; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog(null,"On the first day of school, someone murdered a history teacher. There were four people at the school that the police suspected had done it: the landscaper, a math teacher, a basketball coach, and the principal. These were their alibis:\r\n" + 
				"\r\n" + 
				"The landscaper said he was outside mowing the lawn.\r\n" + 
				"\r\n" + 
				"The math teacher said he was giving a mid-year test.\r\n" + 
				"\r\n" + 
				"The basketball coach said he was running practice drills with his players.\r\n" + 
				"\r\n" + 
				"The principal said she was in her office.\r\n" + 
				"\r\n" + 
				"After giving their alibies, the police arrested the killer immediately. Who killed the history teacher?");
		if (riddle.equals("Math Teacher")) {
			JOptionPane.showMessageDialog(null,"Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null,"Wrong, the math teacher killed the history teacher. Who take a mid-year test for the first day of school?");
		}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		String lion = "three";
		// 5. Otherwise, say "wrong" and tell them the answer
		String nextRiddle  = JOptionPane.showInputDialog("The strangest thing you have ever seen. I have 2 eyes in front, and hundred behind. Who am I?");
		// 6. Add some more riddles
		if (nextRiddle.equals("Peacock")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Nope,it's peacock!");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"Your score is "+score+" out of 2");
	}
}

