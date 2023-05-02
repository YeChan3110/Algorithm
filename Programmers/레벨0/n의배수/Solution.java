package Programmers.레벨0.n의배수;

public class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}
