package com.bellossimo.baekjoon200;

import java.util.Scanner;

public class Baekjoon10828 {
    public static void main(String[] args) {
        int[] stack;
        int size = 0;

        String command;
        int number;
        int repeatCount = 0;

        Scanner sc = new Scanner(System.in);

        repeatCount = Integer.parseInt(sc.nextLine());

        stack = new int[repeatCount];

        while(repeatCount > 0) {
            command = sc.next();

            switch (command) {
                case "push":
                    number = sc.nextInt();
                    stack[size] = number;
                    size += 1;

                    break;
                case "top":
                    if(size == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[size-1]);
                    }

                    break;
                case "size":
                    System.out.println(size);

                    break;
                case "empty":
                    if(size == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }

                    break;
                case "pop":
                    if(size == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[size-1]);
                        size -= 1;
                    }
            }

            repeatCount -= 1;
        }
    }
}
