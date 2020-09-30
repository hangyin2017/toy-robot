package com.toyRobot.input;

import com.toyRobot.command.*;
import com.toyRobot.status.Face;

/** To-do: 读取文件 */
public class InputParser {
    public Command parse(String inputLine) {
        String[] inputArray = this.sanitiser(inputLine).split(" ");
        switch (inputArray[0]) {
            case "MOVE":
                return new Move();
            case "LEFT":
                return new Left();
            case "RIGHT":
                return new Right();
            case "PLACE":
                return this.parsePlaceCommand(inputArray[1].split(","));
            case "REPORT":
                return new Report();
            default:
                System.out.println("Invalid command: " + inputLine);
                return new NullCommand();
        }
    }

    public String sanitiser(String input) {
        return input.trim().toUpperCase();
    }

    /** To-do: 防止非法输入，考虑正则表达式 */
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
