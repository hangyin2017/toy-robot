package main.java.com.toyRobot.command;

import main.java.com.toyRobot.status.*;

public abstract class Command {
    public Status execute(Status status) {
        return status;
    }
}
