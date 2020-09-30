package main.java.com.toyRobot.status;

public class Status {
    private Position position;
    private Face face;

    public Status(int x, int y, Face face) {
        this.position = new Position(x, y);
        this.face = face;
    }

    public Status(Position position, Face face) {
        this.position = position;
        this.face = face;
    }

    public Position position() {
        return this.position;
    }

    public Face face() {
        return this.face;
    }

    @Override
    public String toString() {
        return this.position() + "," + this.face();
    }
}
