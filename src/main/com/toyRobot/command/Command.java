package main.com.toyRobot.command;

import main.com.toyRobot.status.*;

public abstract class Command {
    public Status execute(Status status) {
        return status;
    }
}
