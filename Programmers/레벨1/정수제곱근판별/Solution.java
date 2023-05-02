package Programmers.레벨1.정수제곱근판별;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt((double)n);
        if(result % 1 == 0.0){
            result = Math.pow(result + 1, 2);
            answer = (long)result;
        }else{
            answer = -1;
        }
        return answer;
    }
}
