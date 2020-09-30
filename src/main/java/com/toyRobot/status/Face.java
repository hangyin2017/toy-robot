package main.java.com.toyRobot.status;

public enum Face {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Face left() {
        switch(this) {
            case NORTH:
                return WEST;
            case EAST:
                return NORTH;
            case SOUTH:
                return EAST;
            case WEST:
                return SOUTH;
            default:
                throw new IllegalStateException("Unknown face" + this);
        }
    }

    public Face right() {
        switch(this) {
            case NORTH:
                return EAST;
            case EAST:
                return SOUTH;
            case SOUTH:
                return WEST;
            case WEST:
                return NORTH;
            default:
                throw new IllegalStateException("Unknow face" + this);
        }
    }
}
