package Programmers.레벨1.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(char c : Integer.toString(n).toCharArray()){
            answer += Integer.parseInt(String.valueOf(c));
        }
        
        return answer;
    }
}
