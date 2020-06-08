package com.bellossimo.baekjoon201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stackBracket = new Stack<>();
        Stack<Integer> stackIndex = new Stack<>();

        String line = br.readLine();

        int amount = 0;

        for(int i=0; i<line.length(); i++) {
            if(Character.toString(line.charAt(i)).equals("(")) {
                stackBracket.push(Character.toString(line.charAt(i)));
                stackIndex.push(i);
            } else if(Character.toString(line.charAt(i)).equals(")")) {
                if(stackBracket.pop().equals("(")) {
                    if(i - stackIndex.pop() == 1) {
                        amount += stackBracket.size();
                    } else {
                        amount += 1;
                    }
                }
            }
        }

        System.out.println(amount);
    }
}
