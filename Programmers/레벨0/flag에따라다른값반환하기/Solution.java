package Programmers.레벨0.flag에따라다른값반환하기;

public class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag){
            answer = a + b ;
        }else if(!flag){
            answer = a - b ;
        }
        return answer;
    }
}
