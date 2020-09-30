package main.java.com.toyRobot.table;

import main.java.com.toyRobot.status.Position;

public final class Table {
    private static final Position BOUNDARY = new Position(4, 4);

    public static boolean isValidPosition(Position position) {
        return position.x() >= 0 &&
            position.x() <= BOUNDARY.x() &&
            position.y() >= 0 &&
            position.y() <= BOUNDARY.y();
    }
}
