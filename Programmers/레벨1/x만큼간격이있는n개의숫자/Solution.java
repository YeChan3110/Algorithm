package Programmers.레벨1.x만큼간격이있는n개의숫자;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long a = 0;
        
        for(int i = 0; i < n; i++){
            answer[i] += x+a;
            a += x;
        }
        
        return answer;
    }
}
