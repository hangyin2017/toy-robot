package main.com.toyRobot.robot;

import main.com.toyRobot.status.Status;
import main.com.toyRobot.status.Face;
import main.com.toyRobot.table.Table;
import main.com.toyRobot.command.*;

public class Robot {
    private Status status;
    private Face face;
    
    public Robot() {
        this.status = new Status(0, 0, Face.NORTH);
        this.face = Face.NORTH;
    }

    public void execute(Command command) {
        Status nextStatus = command.execute(this.status);
        if(Table.isValidPosition(nextStatus.position())) {
            this.status = nextStatus;
        } else {
            System.out.println("Dangerous move has been prevented.");
        }
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
		System.out.println(this.status);
    }
    
}
