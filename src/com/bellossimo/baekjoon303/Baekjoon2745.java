package com.bellossimo.baekjoon303;

import java.util.Scanner;

public class Baekjoon2745 {
    public static int findBinaryNumber(char input) {
        int index = 0;

        char[] remainder = {
                '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', 'A', 'B',
                'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        for (int i=0; i<remainder.length; i++) {
            if (input == remainder[i]) {
                index = i;

                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        int n = scanner.nextInt();

        long answer = 0;
        int length = input.length();

        for (int i=0; i<length; i++) {
            int binaryNumber = findBinaryNumber(input.charAt(i));
            long multi = (long)Math.pow(n, length-i-1);
            answer += (binaryNumber * multi);
        }

        System.out.println(answer);
    }
}
