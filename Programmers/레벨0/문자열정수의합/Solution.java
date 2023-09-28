package Programmers.레벨0.문자열정수의합;

public class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for(char c : num_str.toCharArray()){
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }
}
