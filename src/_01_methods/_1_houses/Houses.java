package _01_methods._1_houses;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.moveTo(50, 400);
		rob.penDown();
		rob.setPenWidth(5);
		rob.setSpeed(100);
		rob.turn(90);
		drawGrass();
		for(int i = 0; i< 10; i++) {
		String heightAsString = JOptionPane.showInputDialog(null,"Pick a height");
		int height = Integer.parseInt(heightAsString);
		combo(height);
		}
		
	}
	public void combo(int height) {
		buildHouse(height);
		drawGrass();
	}
	 public void buildHouse(int height) {
		 Random colorRan = new Random();
		 int color = colorRan.nextInt(255);
		 int color2 = colorRan.nextInt(255);
		int color3 = colorRan.nextInt(255);
		 rob.setPenColor(color, color2, color3);
		 rob.turn(270);
			rob.move(height);
			rob.turn(90);
			rob.move(40);
			rob.turn(90);
			rob.move(height);
			rob.turn(270);
	 }
	public void drawGrass() {
		rob.setPenColor(40, 130, 40);
		rob.move(25);
	}
}
