package com.bellossimo.baekjoon301;

import java.util.Scanner;

public class Baekjoon1373 {
    public static int convOctal(String binary) {
        int number = 4;
        int result = 0;

        for (int i=0; i<binary.length(); i++) {
            result += number * Character.getNumericValue(binary.charAt(i));
            number /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String input = scanner.next();

        for (int i = 0; i<input.length()%3; i++) {
            input = '0' + input;
        }

        for (int i=0; i<input.length()/3; i++) {
            sb.append(convOctal(input.substring(3*i, 3*(i+1))));
        }

        System.out.println(sb.toString());
    }
}
