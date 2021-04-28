package Java;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter integer 1: ");
        int num1 = keyboard.nextInt();

        System.out.print("Please enter integer 2: ");
        int num2 = keyboard.nextInt();

        while (num1 < num2) {
            num1++;
            System.out.println(num1);
        }
    }
}
