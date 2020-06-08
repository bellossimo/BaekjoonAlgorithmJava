package com.bellossimo.baekjoon200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int count;
        int[] stack;
        int size = 0;
        int n = 1;
        int number;

        count = Integer.parseInt(br.readLine());

        stack = new int[count];

        while (count > 0) {
            number = Integer.parseInt(br.readLine());

            if(n <= number) {
                while (n <= number) {
                    stack[size] = n;
                    size += 1;
                    n += 1;

                    stringBuilder.append("+\n");
                }
                stack[size-1] = 0;
                size -= 1;

                stringBuilder.append("-\n");
            } else {
                if(size > 0) {
                    if(stack[size-1] == number) {
                        stack[size-1] = 0;
                        size -= 1;

                        stringBuilder.append("-\n");
                    } else {
                        System.out.println("NO");

                        return;
                    }
                }
            }

            count -= 1;
        }

        System.out.println(stringBuilder.toString());
    }
}
