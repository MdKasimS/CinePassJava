package Classes;

import java.io.IOException;
import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    // Constructor to initialize the Scanner
    public Console() {
        scanner = new Scanner(System.in);
    }

    // Method to print a message to the console
    public static void Write(String message) {
        System.out.print(message);
    }

    // Method to print a message to the console with new line
    public static void WriteLine(String message) {
        System.out.println(message);
    }

    public static void WriteLine() {
        System.out.println();
    }

    // Method to accept an integer input from the user
    public static int ReadLine() {
        int input = 0;
        boolean validInput = false;

        int choice;

        while (!validInput) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        return input;
    }

    // Method to clear the console window output
    public static void Clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (InterruptedException | IOException e) {
            System.out.println("Could not clear the console.");
        }
    }
}
