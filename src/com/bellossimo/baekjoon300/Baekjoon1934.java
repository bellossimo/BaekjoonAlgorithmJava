package com.bellossimo.baekjoon300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1934 {
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCount = Integer.parseInt(br.readLine());

        while (testCount > 0) {
            String[] input = br.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int gcd = gcd(a, b);

            sb.append(gcd*(a/gcd)*(b/gcd)).append("\n");

            testCount -= 1;
        }

        System.out.println(sb);
    }
}
