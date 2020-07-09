package com.bellossimo.baekjoon301;

import java.util.Scanner;

public class Baekjoon17103 {
    public static boolean[] makeIsPrimeTable() {
        boolean[] isNotPrime = new boolean[1000001];

        for (int i=2; i <= 1000000; i++) {
            if(! isNotPrime[i]) {
                for (int j=i*2; j<=1000000; j+=i) {
                    isNotPrime[j] = true;
                }
            }
        }


        return isNotPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        boolean[] isNotPrime;

        // 에라토스테네스의 체 세팅.
        isNotPrime = makeIsPrimeTable();

        int testCastCount = scanner.nextInt();

        for (int i=0; i<testCastCount; i++) {
            int number = scanner.nextInt();
            int result = 0;

            for (int j=2; j<=number/2; j++) {
                if(! isNotPrime[j] && ! isNotPrime[number-j]) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
