package com.bellossimo.baekjoon201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sequenceCount = Integer.parseInt(br.readLine());
        int[] ngfSequence = new int[sequenceCount];
        int[] frequency = new int[1000001];

        String[] line = br.readLine().split(" ");
        Stack<Integer> stackIndex = new Stack<>();

        for(int i=0; i<sequenceCount; i++) {
            frequency[Integer.parseInt(line[i])] += 1;
        }

        stackIndex.push(0);

        for(int i=1; i<sequenceCount; i++) {
            while(! stackIndex.empty() && frequency[Integer.parseInt(line[stackIndex.peek()])] < frequency[Integer.parseInt(line[i])]) {
                ngfSequence[stackIndex.pop()] = Integer.parseInt(line[i]);
            }

            stackIndex.push(i);
        }

        while(! stackIndex.empty()) {
            ngfSequence[stackIndex.pop()] = -1;
        }

        for (int i=0; i<ngfSequence.length; i++) {
            sb.append(ngfSequence[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
