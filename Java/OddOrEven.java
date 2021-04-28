package Java;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

        if (num % 2 == 1) {
            System.out.println(false);
        } else
            System.out.println(true);
    }
}
