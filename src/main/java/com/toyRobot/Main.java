package com.toyRobot;

import com.toyRobot.robot.Robot;
import com.toyRobot.input.Input;
import com.toyRobot.input.InputParser;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot();

		new Input().getInput()
				.map(line -> new InputParser().parse(line))
				.forEach(command -> robot.execute(command));
	}
}