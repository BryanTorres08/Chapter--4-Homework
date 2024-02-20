/**
 *
 * Class: HighestLowest
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will display the highest and lowest grade in the class.
 *
 */

import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highestGrade = Integer.MIN_VALUE;
        int lowestGrade = Integer.MAX_VALUE;


        System.out.println("Enter student grades (enter 'c' to calculate highest and lowest grades):");
        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("c")) {
                break;
            }

            try {
                int grade = Integer.parseInt(input);


                if (grade > highestGrade) {
                    highestGrade = grade;
                }

                if (grade < lowestGrade) {
                    lowestGrade = grade;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'c' to calculate highest and lowest grades.");
            }
        }


        if (highestGrade == Integer.MIN_VALUE || lowestGrade == Integer.MAX_VALUE) {
            System.out.println("No grades entered. Cannot calculate highest and lowest grades.");
        } else {

            System.out.println("Highest student grade is " + highestGrade);
            System.out.println("Lowest student grade is " + lowestGrade);
        }
        scanner.close();
    }
}
