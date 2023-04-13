package Programmers.레벨0.숨어있는숫자의덧셈1;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "[0-9]";
        for(char c : my_string.toCharArray()){
            if(String.valueOf(c).matches(num)){
                answer += c - '0';
            }
        }
        return answer;
    }
}
