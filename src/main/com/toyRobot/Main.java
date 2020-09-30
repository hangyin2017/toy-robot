package main.com.toyRobot;

import main.com.toyRobot.robot.Robot;
import main.com.toyRobot.command.*;
import main.com.toyRobot.status.Face;

public class Main {
		public static void main(String[] args) {
			Robot robot = new Robot();
			Command move = new Move();
			Command left = new Left();
			Command place = new Place(2, 1, Face.EAST);
			robot.execute(move);
			robot.report();
			robot.execute(place);
			robot.execute(move);
			robot.execute(left);
			robot.report();
	}
}