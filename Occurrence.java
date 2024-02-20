/**
 *
 * Class: Occurrence
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will ask user for a String value and a character value last occurence to display corresponding index.
 *
 */

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String value: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character value: ");
        char targetChar = scanner.next().charAt(0);

        int lastIndex = findLastOccurrence(inputString, targetChar);

        if (lastIndex != -1) {
            System.out.println("Last occurrence of character '" + targetChar + "' in \"" + inputString + "\" is at index " + lastIndex);
        } else {
            System.out.println("Character '" + targetChar + "' is not found in \"" + inputString + "\"");
        }

        scanner.close();
    }

    public static int findLastOccurrence(String str, char target) {

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
