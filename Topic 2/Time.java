/*
 * This program outputs how many hours, minutes, and seconds are derived
 * from the seconds a user inputs
 * This program demonstrates the / & % operators
 */
import java.util.Scanner; // Makes it possible for user to input from keyboard

public class Time {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five numbers to represent seconds: ");
        int seconds = input.nextInt(); // Stores user input as seconds

        int hours = seconds / 3600; // seconds in an hour
        int minutes = seconds % 3600 / 60; // Remainder is minutes
        int secondsLeft = seconds % 60; // Remainder is seconds left
        System.out.println("You have entered " + seconds + " seconds. "
                + seconds + " seconds represents: " + hours + " hours " + minutes
                + " minutes & " + secondsLeft + " seconds.");
    }
}
