package com.bellossimo.baekjoon300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int result = 0;
        int input = Integer.parseInt(br.readLine());

        for (int i=5; i<=input; i *=5) {
            result += input/i;
        }

        System.out.println(result);

    }
}
