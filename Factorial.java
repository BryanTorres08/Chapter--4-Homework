/**
 *
 * Class: Factorial
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will prompt user for an integer value to calculate and display the factorial.
 *
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int n = scanner.nextInt();

        long factorial = calculateFactorial(n);

        System.out.println(n + "! = " + factorial);

        scanner.close();
    }

    public static long calculateFactorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        long factorial = 1;


        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
