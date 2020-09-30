package com.toyRobot.input;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Input {
    public Stream<String> getInput() {
        List<String> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input commands. One command each line.");
        System.out.println("To complete input, enter 'end'.");

        while(!scanner.hasNext("end")) {
            input.add(scanner.nextLine());
        }

        scanner.close();
        return input.stream();
    } 
}
