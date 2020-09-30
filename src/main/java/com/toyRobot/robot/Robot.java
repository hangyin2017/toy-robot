package main.java.com.toyRobot.robot;

import main.java.com.toyRobot.status.Status;
import main.java.com.toyRobot.table.Table;
import main.java.com.toyRobot.command.*;

public class Robot {
    private Status status;

    public void execute(Command command) {
        // Discard commands until it is placed.
        if(this.status == null && !(command instanceof Place)) {
                System.out.println("Not placed yet. Command discarded.");
                return;
        }

        Status nextStatus = command.execute(this.status);

        if(Table.isValidPosition(nextStatus.position())) {
            this.status = nextStatus;
        } else {
            System.out.println("Dangerous move has been prevented.");
        }
    }
}
