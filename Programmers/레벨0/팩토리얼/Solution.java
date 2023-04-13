package Programmers.레벨0.팩토리얼;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        int i = 1;

        while(true){
            fac *= i+1;
            if(fac > n){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
