package com.bellossimo.baekjoon100;

import java.util.Scanner;

public class Baekjoon11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeatCount, a, b;

        repeatCount = Integer.parseInt(scanner.nextLine());

        for (int i=1; i<= repeatCount; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a+b);
        }
    }
}
