package basics;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();
        scanner.close(); // What happens if you don't close the scanner? It will remain open until the program is closed.

        double payRate = hours * rate;

        System.out.println("Gross Pay: " + payRate);
    }
}
