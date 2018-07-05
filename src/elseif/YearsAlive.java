package elseif;

import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		String age= JOptionPane.showInputDialog("How old are you?");
		int a= Integer.parseInt(age);
		for(int i=2019- a;i<2019; i++) {
			System.out.println(i);
		}
	}
}
