package Programmers.레벨0.합성수찾기;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 3; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count >= 3){
                answer++;
            }
        }
        return answer;
    }
}
