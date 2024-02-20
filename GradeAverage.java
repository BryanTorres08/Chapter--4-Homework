/**
 *
 * Class: GradeAverage
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will determine if the integer is a prime number.
 *
 */

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter student grades (enter 'c' to calculate average):");
        while (true) {
            java.lang.String input = scanner.nextLine();

            if (input.equals("c")) {
                break;
            }

            try {
                int grade = Integer.parseInt(input);
                sum += grade;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'c' to calculate average.");
            }
        }


        if (count == 0) {
            System.out.println("No grades entered. Cannot calculate average.");
        } else {
            double average = (double) sum / count;
            System.out.printf("Average student grade is %.1f%n", average);
        }

        scanner.close();
    }
}
