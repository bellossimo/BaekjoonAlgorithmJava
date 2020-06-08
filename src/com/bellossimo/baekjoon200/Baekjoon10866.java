package com.bellossimo.baekjoon200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new LinkedList<>();

        int commendCount = Integer.parseInt(br.readLine());

        while (commendCount > 0) {
            String[] line = br.readLine().split(" ");

            switch (line[0]) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(line[1]));

                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(line[1]));

                    break;
                case "pop_front":
                    System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());

                    break;
                case "pop_back":
                    System.out.println(deque.isEmpty() ? -1 : deque.pollLast());

                    break;
                case "size":
                    System.out.println(deque.size());

                    break;
                case "empty":
                    if(deque.size() == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }

                    break;
                case "front":
                    if(deque.size() == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.getFirst());
                    }

                    break;
                case "back":
                    if(deque.size() == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.getLast());
                    }

                    break;
            }

            commendCount -= 1;
        }
    }
}
