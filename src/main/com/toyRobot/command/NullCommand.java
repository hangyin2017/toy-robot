package main.com.toyRobot.command;

import main.com.toyRobot.status.Status;

public class NullCommand extends Command {
    @Override
    public Status execute(Status status) {
        return status;
    }
}
