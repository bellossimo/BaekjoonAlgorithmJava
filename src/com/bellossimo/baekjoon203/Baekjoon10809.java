package com.bellossimo.baekjoon203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        for(int i=0; i<26; i++) {
            sb.append(input.indexOf(i+97));
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
