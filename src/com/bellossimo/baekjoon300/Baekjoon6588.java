package com.bellossimo.baekjoon300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] isNotPrime = new boolean[1000001];

        // 에라토스테네스의 체 > 소수 여부 세팅.
        for (int i=2; i<=1000000; i++) {
            if(! isNotPrime[i]) {
                for (int j=i*2; j<=1000000; j+=i) {
                    isNotPrime[j] = true;
                }
            }
        }

        while(true) {
            int number = Integer.parseInt(br.readLine());
            boolean isExists = false;

            if(number == 0) {
                System.out.println(sb);

                return;
            }

            for (int i=3; i<=number; i+=2) {
                if(! isNotPrime[i] && ! isNotPrime[number-i]) {
                    sb.append(number + " = " + i + " + " + (number-i)).append("\n");
                    isExists = true;

                    break;
                }
            }

            if (! isExists) {
                sb.append("Goldbach's conjecture is wrong.").append("\n");
            }
        }
    }
}
