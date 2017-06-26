/*
 * This program converts Celsius to Fahrenheit and vise verse
 */
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to represent degrees in Fahrenheit: ");
        double fahrenheit = input.nextInt(); // Stores original F

        double newFahrenheit = (fahrenheit - 32) * 5 / 9;
        // Converts F to C formula
        System.out.println(fahrenheit + "F converted to Celsius is "
                + newFahrenheit + "C.\n");

        System.out.print("Enter a number to represent degrees in Celsius: ");
        double celsius = input.nextInt(); // Stores original C

        double newCelsius = celsius * 9 / 5 + 32; // Converts C to F formula
        System.out.println(celsius + "C converted to Fahrenheit is "
                + newCelsius + "F.");
    }

}
