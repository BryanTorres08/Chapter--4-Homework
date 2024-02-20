/**
 *
 * Class: Fibonacci
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will display the first 30 values in the Fibonacci series.
 *
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n = 30;
        int first = 0;
        int second = 1;

        System.out.print(first + ", " + second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
