package com.bellossimo.baekjoon400;

import java.util.Scanner;

public class Baekjoon1463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] d = new int[1000001];
        int input = scanner.nextInt();

        d[1] = 0;

        for (int i=2; i<=input; i++) {
            d[i] = d[i-1] + 1;

            if(i%2 == 0 && d[i] > d[i/2] + 1) {
                d[i] = d[i/2] + 1;
            }

            if(i%3 == 0 && d[i] > d[i/3] + 1) {
                d[i] = d[i/3] + 1;
            }
        }

        System.out.println(d[input]);
    }
}
