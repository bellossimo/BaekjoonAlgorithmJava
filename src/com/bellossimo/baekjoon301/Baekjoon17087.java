package com.bellossimo.baekjoon301;

import java.util.Scanner;

public class Baekjoon17087 {
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brotherCount = scanner.nextInt();
        int position = scanner.nextInt();
        int[] brotherPositionArr = new int[brotherCount];

        for (int i=0; i<brotherCount; i++) {
            int brotherPosition = scanner.nextInt();

            brotherPositionArr[i] = (position > brotherPosition) ? position - brotherPosition : brotherPosition - position;
        }

        int gcd = brotherPositionArr[0];

        if(brotherCount > 1) {
            for(int i=1; i<brotherCount; i++) {
                gcd = gcd(gcd, brotherPositionArr[i]);
            }
        }

        System.out.println(gcd);
    }
}
