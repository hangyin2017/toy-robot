package com.toyRobot.status;

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
    public boolean equals(Object obj) {
        if(!(obj instanceof Status)) {
            return false;
        }
        Status target = (Status) obj;
        return this.face() == target.face() && this.position().equals(target.position());
    }

    @Override
    public String toString() {
        return this.position() + "," + this.face();
    }
}
