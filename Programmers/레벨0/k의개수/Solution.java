package Programmers.레벨0.k의개수;

public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String sk = Integer.toString(k);
    
        for(int in = i; in <= j; in++){
            if(Integer.toString(in).contains(sk)){
                answer++;
            }
        }
    
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(10, 50, 5);
    }
}
