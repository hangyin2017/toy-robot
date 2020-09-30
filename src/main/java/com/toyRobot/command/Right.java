package main.java.com.toyRobot.command;

import main.java.com.toyRobot.status.Status;

public class Right extends Command {
    @Override
    public Status execute(Status prevStatus) {
        return new Status(prevStatus.position(), prevStatus.face().right());
    }
}
