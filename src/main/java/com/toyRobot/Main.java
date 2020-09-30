package main.java.com.toyRobot;

import main.java.com.toyRobot.robot.Robot;
import main.java.com.toyRobot.input.Input;
import main.java.com.toyRobot.input.InputParser;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot();

		new Input().getInput()
				.map(line -> new InputParser().parse(line))
				.forEach(command -> robot.execute(command));
	}
}