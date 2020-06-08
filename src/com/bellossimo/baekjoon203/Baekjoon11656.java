package com.bellossimo.baekjoon203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int inputLength = input.length();
        String[] suffixArray = new String[inputLength];

        for (int i=0; i<inputLength; i++) {
            suffixArray[i] = input.substring(i, inputLength);
        }

        Arrays.sort(suffixArray);

        for (String suffix: suffixArray) {
            sb.append(suffix).append("\n");
        }

        System.out.println(sb);
    }
}
