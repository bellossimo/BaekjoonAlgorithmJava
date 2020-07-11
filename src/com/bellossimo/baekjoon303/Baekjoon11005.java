package com.bellossimo.baekjoon303;

import java.util.Scanner;

public class Baekjoon11005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        char[] remainder = {
                '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', 'A', 'B',
                'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        int input = scanner.nextInt();
        int n = scanner.nextInt();

        while (true) {
            if (input == 0) {
                break;
            }

            sb.append(remainder[input%n]);
            input = input/n;
        }

        System.out.println(sb.reverse());
    }
}
