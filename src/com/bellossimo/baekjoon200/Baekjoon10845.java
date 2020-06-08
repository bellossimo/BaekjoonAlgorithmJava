package com.bellossimo.baekjoon200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int start = 0;
        int end = 0;
        int[] queue;

        int count = Integer.parseInt(br.readLine());
        queue = new int[count];

        while(count > 0) {
            String[] line = br.readLine().split(" ");

            switch (line[0]) {
                case "push":
                    queue[end] = Integer.parseInt(line[1]);
                    end += 1;

                    break;
                case "pop":
                    if(end == start) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue[start]);
                        sb.append("\n");

                        queue[start] = 0;
                        start += 1;
                    }

                    break;
                case "front":
                    if(end == start) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue[start]);
                        sb.append("\n");
                    }

                    break;
                case "back":
                    if(end == start) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue[end-1]);
                        sb.append("\n");
                    }

                    break;
                case "size":
                    sb.append(end-start);
                    sb.append("\n");

                    break;
                case "empty":
                    if(end == start) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }

                    break;
            }

            count -= 1;
        }

        System.out.println(sb.toString());
    }
}
