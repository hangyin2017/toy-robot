package main.java.com.toyRobot.command;

import main.java.com.toyRobot.status.Status;

public class NullCommand extends Command {
    @Override
    public Status execute(Status status) {
        return status;
    }
}
