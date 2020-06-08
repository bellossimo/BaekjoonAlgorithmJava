package com.bellossimo.baekjoon201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sequenceCount = Integer.parseInt(br.readLine());
        int[] ngeSequence = new int[sequenceCount];

        String[] line = br.readLine().split(" ");
        Stack<Integer> stackIndex = new Stack<>();

        stackIndex.push(0);

        for(int i=1; i<sequenceCount; i++) {
            while(! stackIndex.empty() && Integer.parseInt(line[stackIndex.peek()]) < Integer.parseInt(line[i])) {
                ngeSequence[stackIndex.pop()] = Integer.parseInt(line[i]);
            }

            stackIndex.push(i);
        }

        while(! stackIndex.empty()) {
            ngeSequence[stackIndex.pop()] = -1;
        }

        for (int i=0; i<ngeSequence.length; i++) {
            sb.append(ngeSequence[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
