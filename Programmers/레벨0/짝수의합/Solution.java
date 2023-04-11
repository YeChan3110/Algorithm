package Programmers.레벨0.짝수의합;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;

        for(int i = 0; i <= n;i++){
            if(i % 2 == 0){
                answer += num;
                num += 2;
            }
        }

        return answer;
    }
}
