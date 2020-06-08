package com.bellossimo.baekjoon300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        sb.append((a+b)%c).append("\n");
        sb.append(((a%c) + (b%c))%c).append("\n");
        sb.append((a*b)%c).append("\n");
        sb.append(((a%c)*(b%c))%c).append("\n");

        System.out.println(sb);
    }
}
