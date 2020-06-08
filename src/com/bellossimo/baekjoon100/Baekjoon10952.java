package com.bellossimo.baekjoon100;

import java.util.Scanner;

public class Baekjoon10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        while(scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            if(a == 0 && b == 0) {
                break;
            } else {
                System.out.println(a + b);
            }

        }
    }
}
