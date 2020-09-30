package com.toyRobot.robot;

import com.toyRobot.status.Status;
import com.toyRobot.table.Table;
import com.toyRobot.command.*;

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
