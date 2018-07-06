package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	public static void main(String[] args) {
		String answer =JOptionPane.showInputDialog("What shape do you want the robot to draw?");
		ObedientRobot or = new ObedientRobot();
		Robot r2d2 = new Robot();
		r2d2.penDown();
		if(answer.equalsIgnoreCase("square")) {
			or.drawSquare(r2d2);
		}
		if(answer.equalsIgnoreCase("Triangle")) {
		or.drawTriangle(r2d2);
		}
		if(answer.equalsIgnoreCase("circle")){
		or.drawCircle(r2d2);
		}
		}

	public void drawSquare(Robot r) {
		for(int i =0; i <4; i++) {
			r.setSpeed(25);
			r.turn(90);
			r.move(100);
			
		}
	}
	public void drawTriangle(Robot r) {
		for(int i=0; i<2; i++) {
			r.setSpeed(25);
			r.turn(60);
			r.move(100);
		}
		r.turn(150);
		r.move(200);
	}
	public void drawCircle(Robot r) {
		System.out.println("hello");
		for (int i=0; i<360; i++) {
			r.setSpeed(500);
			r.move(1);
			r.turn(1);

		}
	}
}
