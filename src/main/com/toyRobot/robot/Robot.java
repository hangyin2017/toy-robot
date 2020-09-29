package main.com.toyRobot.robot;

import main.com.toyRobot.position.Face;

public class Robot {
    private int positionX = 0;
    private int positionY = 0;
    private Face face = Face.NORTH;
    
    public void place(int x, int y, Face face) {
        this.positionX = x;
        this.positionY = y;
        this.face = face;
    }

    public Face face() {
        return this.face;
    }

    public void left() {
        this.face = this.face.left();
    }

    public void right() {
        this.face = this.face.right();
    }

    public void report() {
		System.out.println(this.positionX + "," + this.positionY + "," + this.face);
    }
    
}
