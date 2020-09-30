package com.toyRobot.input;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Input {
    public Stream<String> getInput() {
        List<String> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()) {
            input.add(scanner.nextLine());
        }

        scanner.close();
        return input.stream();
    } 
}
