package Programmers.레벨1.두정수사이의합;

import java.util.*;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<>();

        for(int i = a; i <= b; i++){
            list.add((long)i);
        }
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
            System.out.println(answer);
            answer *= list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(3, 5);
    }
}
