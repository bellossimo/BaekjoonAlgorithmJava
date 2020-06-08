package com.bellossimo.baekjoon200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        String[] nk = br.readLine().split(" ");

        for(int i=1; i<= Integer.parseInt(nk[0]); i++) {
            queue.offer(i);
        }

        sb.append("<");
        while(! queue.isEmpty()) {
            for(int i=1; i<Integer.parseInt(nk[1]); i++) {
                int temp = queue.poll();
                queue.offer(temp);
            }

            int out = queue.poll();
            sb.append(out);

            if(! queue.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");

        System.out.println(sb.toString());
    }
}
