package com.bellossimo.baekjoon200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String[] stack1;
        String[] stack2;
        int stack1Size = 0;
        int stack2Size = 0;

        String sentence = br.readLine();

        stack1 = new String[600001];
        stack2 = new String[600001];

        for (int i=0; i<sentence.length(); i++) {
            stack1[stack1Size] = Character.toString(sentence.charAt(i));
            stack1Size += 1;
        }

        int commandCount = Integer.parseInt(br.readLine());

        while(commandCount > 0) {
            String[] line = br.readLine().split(" ");

            switch (line[0]) {
                case "P":
                    stack1[stack1Size] = line[1];
                    stack1Size += 1;

                    break;
                case "L":
                    if(stack1Size > 0) {
                        stack2[stack2Size] = stack1[stack1Size-1];
                        stack1[stack1Size-1] = null;
                        stack2Size += 1;
                        stack1Size -= 1;
                    }

                    break;
                case "D":
                    if(stack2Size > 0) {
                        stack1[stack1Size] = stack2[stack2Size-1];
                        stack2[stack2Size-1] = null;
                        stack1Size += 1;
                        stack2Size -= 1;
                    }

                    break;

                case "B":
                    if(stack1Size > 0) {
                        stack1[stack1Size-1] = null;
                        stack1Size -= 1;
                    }

                    break;
            }

            commandCount -= 1;
        }

        for(int i=0; i<stack1Size; i++) {
            stringBuilder.append(stack1[i]);
        }

        for(int i=stack2Size; i>0; i--) {
            stringBuilder.append(stack2[i-1]);
        }

        System.out.println(stringBuilder);
    }
}
