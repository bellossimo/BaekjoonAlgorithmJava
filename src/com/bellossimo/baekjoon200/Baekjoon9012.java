package com.bellossimo.baekjoon200;

import java.util.Scanner;

public class Baekjoon9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count;
        String sentence;

        char[] stack;
        int size;

        count = Integer.parseInt(sc.nextLine());

        while (count > 0) {
            sentence = sc.nextLine();

            stack = new char[sentence.length()];
            size = 0;

            for (int i=0; i<sentence.length(); i++) {
                if(sentence.charAt(i) == '(') {
                    stack[size] = sentence.charAt(i);
                    size += 1;
                } else {
                    if(size > 0 && stack[size-1] == '(') {
                        stack[size-1] = ' ';
                        size -= 1;
                    } else {
                        size -= 1;

                        break;
                    }
                }
            }

            if (size == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            count --;
        }
    }
}
