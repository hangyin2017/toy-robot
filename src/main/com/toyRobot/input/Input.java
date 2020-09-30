package main.com.toyRobot.input;

import java.util.Scanner;
import main.com.toyRobot.command.*;
import main.com.toyRobot.status.Face;

public class Input {
    public Command apply() {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String[] input = this.sanitiser(scanner.nextLine()).split(" ");
            switch (input[0]) {
                case "MOVE":
                    return new Move();
                case "LEFT":
                    return new Left();
                case "RIGHT":
                    return new Right();
                case "PLACE":
                    return this.parsePlaceCommand(input[1].split(","));
                default:
                    System.out.println("Invalid command.");
                    return new NullCommand();
            }
        }
        scanner.close();
        return new NullCommand();
    }

    public String sanitiser(String input) {
        return input.trim().toUpperCase();
    }

    private Command parsePlaceCommand(String[] params) {
        return new Place(
                Integer.parseInt(params[0]),
                Integer.parseInt(params[1]),
                parsePlaceCommandFace(params[2])
        );
    }

    private Face parsePlaceCommandFace(String faceInput) {
        switch (faceInput) {
            case "NORTH":
                return Face.NORTH;
            case "EAST":
                return Face.EAST;
            case "SOUTH":
                return Face.SOUTH;
            case "WEST":
                return Face.WEST;
            default:
                throw new IllegalArgumentException("Invalid face input: " + faceInput);

        }
    }
}
