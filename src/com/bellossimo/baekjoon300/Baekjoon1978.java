package com.bellossimo.baekjoon300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1978 {
    public static boolean prime(int number) {
        if(number < 2) {
            return false;
        }

        for (int i=2; i<=number/2; i++) {
            if(number%i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCount = Integer.parseInt(br.readLine());
        int primeCount = 0;

        String[] input = br.readLine().split(" ");

        for (int i=0; i<testCount; i++) {
            if(prime(Integer.parseInt(input[i]))) {
                primeCount += 1;
            }
        }

        System.out.println(primeCount);
    }
}
