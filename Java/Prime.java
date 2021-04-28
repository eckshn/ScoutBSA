package Java;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}