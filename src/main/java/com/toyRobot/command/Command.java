package com.toyRobot.command;

import com.toyRobot.status.*;

public abstract class Command {
    public Status execute(Status status) {
        return status;
    }
}
