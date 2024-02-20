/**
 *
 * Class: Pattern
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will display a pattern of * in rows.
 *
 */

public class Pattern {
    public static void main(String[] args) {

        for (int i = 6; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
