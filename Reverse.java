/**
 *
 * Class: Reverse
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will display string value from user and displays the reverse of that value.
 *
 */

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String value: ");
        String input = scanner.nextLine();

        String reverse = reverseString(input);
        System.out.println("Reverse of \"" + input + "\" is \"" + reverse + "\"");

        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}

