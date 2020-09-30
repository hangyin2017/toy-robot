package main.java.com.toyRobot.command;

import main.java.com.toyRobot.status.*;

public class Move extends Command {
    @Override
    public Status execute(Status prevStatus) {
        switch (prevStatus.face()) {
            case NORTH:
                return new Status(prevStatus.position().x(), prevStatus.position().y() + 1, prevStatus.face());
            case EAST:
                return new Status(prevStatus.position().x() + 1, prevStatus.position().y(), prevStatus.face());
            case SOUTH:
                return new Status(prevStatus.position().x(), prevStatus.position().y() - 1, prevStatus.face());
            case WEST:
                return new Status(prevStatus.position().x() - 1, prevStatus.position().y(), prevStatus.face());
            default:
                return prevStatus;
        }
    }
}
