
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 25th";
		String dadsBirthday = "February 14th";
		String myBirthday = "January 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String response = JOptionPane.showInputDialog("What birthday do you want");
		// 3. Print out what the user typed
		System.out.println(response);
		// 4. if user asked for "mom"
		if(response.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		else if(response.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if(response.equalsIgnoreCase("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
	} 
	}
}
