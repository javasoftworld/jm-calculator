package com.example.util;

import java.util.Scanner;

public class ConsoleProcessor {
    private static final Scanner sc = new Scanner(System.in);

    public static String getOperationStringFromConsole(String message) {
        String valueToReturn;

        System.out.println(message);
        while (!sc.hasNextLine()) {
            sc.nextLine();
            System.out.println();
            System.out.print(message);
        }
        valueToReturn = sc.nextLine();

        return valueToReturn;
    }

    public static void printOutTheResult(String resultString) {
        System.out.println("Output: \n" + resultString);
    }
}
