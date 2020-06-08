package com.bellossimo.baekjoon100;

import java.util.Scanner;

public class Baekjoon10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        while(scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println(a + b);
        }
    }
}
