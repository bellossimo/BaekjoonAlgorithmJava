package com.bellossimo.baekjoon200;

import java.util.Scanner;

public class Baekjoon9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count;
        String sentence;

        char[] stack;
        int size;

        count = Integer.parseInt(sc.nextLine());

        while (count > 0) {
            sentence = sc.nextLine() + "\n";

            stack = new char[sentence.length()];
            size = 0;

            for (int i=0; i<sentence.length(); i++) {
                if(sentence.charAt(i) == ' ' || sentence.charAt(i) == '\n') {
                    while(size > 0) {
                        System.out.print(stack[size-1]);
                        size -= 1;
                    }

                    System.out.print(sentence.charAt(i));
                } else {
                    stack[size] = sentence.charAt(i);
                    size += 1;
                }
            }

            count --;
        }
    }
}
