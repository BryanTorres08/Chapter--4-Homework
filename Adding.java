/**
 *
 * Class: Adding
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will display and sum the sum of the digits of the provided integer.
 *
 */

import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = calculateDigitSum(number);

        System.out.println("Sum of digits of " + number + " is " + sum);

        scanner.close();
    }

    public static int calculateDigitSum(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
}
