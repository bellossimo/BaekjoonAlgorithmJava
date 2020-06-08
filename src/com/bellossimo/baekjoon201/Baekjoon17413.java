package com.bellossimo.baekjoon201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();

        boolean isTagOpen = false;

        String sentence = br.readLine() + "\n";

        for (int i=0; i<sentence.length(); i++) {
            if(Character.toString(sentence.charAt(i)).equals("<")
                    || (Character.toString(sentence.charAt(i)).equals(" ") && ! isTagOpen)
                    || Character.toString(sentence.charAt(i)).equals("\n")) {
                while(! stack.empty()) {
                    sb.append(stack.pop());
                }

                sb.append(sentence.charAt(i));

                if(Character.toString(sentence.charAt(i)).equals("<") && ! isTagOpen) {
                    isTagOpen = true;
                }
            } else {
                if(isTagOpen) {
                    sb.append(sentence.charAt(i));
                } else {
                    stack.push(Character.toString(sentence.charAt(i)));
                }
            }

            if(Character.toString(sentence.charAt(i)).equals(">")) {
                isTagOpen = false;
            }
        }

        System.out.print(sb.toString());
    }
}
