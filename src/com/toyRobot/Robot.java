package com.toyRobot;
import java.util.Arrays;

public class Robot {
	private int[] position = {0,0};
	private String face = "NORTH";
	
	public void place(int x, int y, String face) {
		this.position[0] = x;
		this.position[1] = y;
		this.face = face;
	}
	
	public void move() {
		switch(this.face) {
		case "NORTH":
			this.position[1]++;
			break;
		case "EAST":
			this.position[0]++;
			break;
		case "SOUTH":
			this.position[1]--;
			break;
		case "WEST":
			this.position[0]--;
			break;
		}
	}
	
	public void report() {
		System.out.println(Arrays.toString(this.position).substring(1,5) + ", " + this.face);
	}
	
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.report();
		robot.place(1,2,"EAST");
		robot.report();
	}
}
