package com.bellossimo.baekjoon301;

import java.util.Scanner;

public class Baekjoon1212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = scanner.nextLine();
        String[] binaryOctalArray = {"000", "001", "010", "011", "100", "101", "110", "111"};

        if(input.length() == 1 && input.charAt(0) == '0') {
            sb.append(0);
        } else {
            for (int i=0; i<input.length(); i++) {
                int n = Character.getNumericValue(input.charAt(i));

                if(i == 0 && n < 4) {
                    switch (n) {
                        case 1:
                            sb.append("1");

                            break;
                        case 2:
                            sb.append("10");

                            break;
                        case 3:
                            sb.append("11");

                            break;
                    }
                } else {
                    sb.append(binaryOctalArray[n]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
