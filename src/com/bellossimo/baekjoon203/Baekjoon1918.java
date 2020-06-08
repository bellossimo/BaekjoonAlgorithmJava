package com.bellossimo.baekjoon203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String line = br.readLine();

        for (int i=0; i<line.length(); i++) {
            int code = (int)line.charAt(i);

            if(code >=65 && code <= 90) {
                sb.append(line.charAt(i));
            } else if(line.charAt(i) == '*' || line.charAt(i) == '/') {
                while(! stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
                    sb.append(stack.pop());
                }

                stack.push(line.charAt(i));
            } else if(line.charAt(i) == '+' || line.charAt(i) == '-') {
                while(! stack.empty() && (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-')) {
                    sb.append(stack.pop());
                }

                stack.push(line.charAt(i));
            } else if(line.charAt(i) == '(') {
                stack.push(line.charAt(i));
            } else if(line.charAt(i) == ')') {
                while(stack.peek() != '(') {
                    sb.append(stack.pop());
                }

                stack.pop();
            }
        }

        while (! stack.empty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }
}
