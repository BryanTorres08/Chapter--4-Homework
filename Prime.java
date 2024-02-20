/**
 *
 * Class: Prime
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will determine if the integer is a prime number.
 *
 */

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isPrime = checkPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        scanner.close();
    }

    public static boolean checkPrime(int num) {

        if (num <= 1) {
            return false;
        }


        int limit = num / 2;


        for (int i = 2; i <= limit; i++) {


            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
