package main.com.toyRobot;

import main.com.toyRobot.robot.Robot;

public class Main {
		public static void main(String[] args) {
			Robot robot = new Robot();
			robot.report();
			System.out.println(robot.face());
			robot.report();
			// robot.left();
			// robot.report();
			// robot.left();
			// robot.report();
			// robot.left();
			// robot.report();
	}
}