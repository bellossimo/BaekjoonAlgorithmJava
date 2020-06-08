package com.bellossimo.baekjoon100;

import java.util.Scanner;

public class Baekjoon10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeatCount, a, b;

        repeatCount = Integer.parseInt(scanner.nextLine());

        while (repeatCount > 0) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println(a+b);

            repeatCount -= 1;
        }
    }
}
