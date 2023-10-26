package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		Robot rob = new Robot();
		rob.moveTo(600, 300);
		rob.penDown();
		rob.setPenWidth(5);
		rob.setSpeed(100);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(100);
	}
}
