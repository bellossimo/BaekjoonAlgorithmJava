package com.bellossimo.baekjoon300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");

        int from = Integer.parseInt(input[0]);

        int to = Integer.parseInt(input[1]);

        int primeCount = 0;
        int[] prime = new int[1000000];
        boolean[] check = new boolean[1000001];

        for (int i=2; i<=to; i++) {
            if(! check[i]) {
                prime[primeCount++] = i;

                for (int j=i*2; j<=to; j+=i) {
                    check[j] = true;
                }
            }
        }

        for (int i=0; i<primeCount; i++) {
            if(prime[i]>=from) {
                sb.append(prime[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
