package main.com.toyRobot;

import main.com.toyRobot.robot.Robot;
import main.com.toyRobot.command.*;

public class Main {
		public static void main(String[] args) {
			Robot robot = new Robot();
			Command move = new Move();
			Command left = new Left();
			robot.execute(move);
			robot.report();
			robot.execute(left);
			robot.execute(move);
			robot.report();

			// robot.move();
			// robot.move();
			// robot.report();
	}
}