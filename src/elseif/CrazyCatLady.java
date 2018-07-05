//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String answer=JOptionPane.showInputDialog("How many cats do you have");
		int a =Integer.parseInt(answer);
		// 2. Convert their answer into an int
		if(a>3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady");
		}
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		else if (a<3 && a>0) {
			playVideo("https://www.youtube.com/watch?v=XyNlqQId-nk");
		}
		else if (a==0) {
		playVideo("https://www.youtube.com/watch?v=W_juM14WHNQ");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

