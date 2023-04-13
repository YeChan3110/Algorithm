package Programmers.레벨0.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        for(char c : num.toCharArray()){
            answer += c - '0';
        }
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(1234);
    }
}
