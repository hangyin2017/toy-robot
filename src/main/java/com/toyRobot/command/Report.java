package main.java.com.toyRobot.command;

import main.java.com.toyRobot.status.Status;

public class Report extends Command {
    @Override
    public Status execute(Status status) {
        System.out.println(status == null ? "Not placed yet." : status);
        return status;
    }
}