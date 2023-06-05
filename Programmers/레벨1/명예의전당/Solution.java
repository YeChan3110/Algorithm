package Programmers.레벨1.명예의전당;

import java.util.*;

public class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            q.add(score[i]);
            if (q.size() > k) {
                q.poll();
            }
            answer[i] = q.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {1,2,3,4,5};
        new Solution().solution(k, score);
    }
}