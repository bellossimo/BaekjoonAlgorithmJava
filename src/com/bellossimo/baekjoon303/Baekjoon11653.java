package com.bellossimo.baekjoon303;

import java.util.Scanner;

public class Baekjoon11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int i=2; i*i <= input; i++) {
            while (input%i == 0) {
                System.out.printf("%d\n", i);
                input /= i;
            }
        }

        if (input > 1) {
            System.out.printf("%d\n", input);
        }
    }
}
