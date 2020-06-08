package com.bellossimo.baekjoon300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10872 {
    public static long factorial(int number) {
        if(number <= 1) {
            return 1;
        } else {
            return factorial(number-1) * number;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        System.out.print(factorial(input));
    }
}
