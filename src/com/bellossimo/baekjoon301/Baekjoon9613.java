package com.bellossimo.baekjoon301;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon9613 {
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testCaseCount = scanner.nextInt();

        while (testCaseCount > 0) {
            int numberCount = scanner.nextInt();
            int[] inputArr = new int[numberCount];

            for (int i=0; i<numberCount; i++) {
                inputArr[i] = scanner.nextInt();
            }

            long sum = 0;

            for (int i=0; i<numberCount-1; i++) {
                for (int j=i+1; j<numberCount; j++) {
                    sum += gcd(inputArr[i], inputArr[j]);
                }
            }

            sb.append(sum).append("\n");

            testCaseCount--;
        }

        System.out.println(sb);
    }
}
