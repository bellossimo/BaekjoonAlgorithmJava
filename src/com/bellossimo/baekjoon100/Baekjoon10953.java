package com.bellossimo.baekjoon100;

import java.util.Scanner;

public class Baekjoon10953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeatCount;
        String[] number;

        repeatCount = Integer.parseInt(scanner.nextLine());

        while(repeatCount > 0) {
            number = scanner.nextLine().split(",");

            System.out.println(Integer.parseInt(number[0]) + Integer.parseInt(number[1]));

            repeatCount --;
        }
    }
}
