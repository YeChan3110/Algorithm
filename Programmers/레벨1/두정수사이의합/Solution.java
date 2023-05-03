package Programmers.레벨1.두정수사이의합;

import java.util.*;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<>();

        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        for(int i = a; i <= b; i++){
            list.add((long)i);
        }

        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(3, 5);
    }
}
