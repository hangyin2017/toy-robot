package com.toyRobot.status;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Position)) {
            return false;
        }
        Position target = (Position) obj;
        return this.x() == target.x() && this.y() == target.y();
    }

    @Override
    public String toString() {
        return this.x() + "," + this.y();
    }
}
