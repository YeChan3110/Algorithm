package Programmers.레벨0.n보다커질때까지더하기;

public class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
            if(answer > n) break;
        }

        return answer;
    }
}
