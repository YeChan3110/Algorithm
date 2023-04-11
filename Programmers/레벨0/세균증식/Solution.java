package Programmers.레벨0.세균증식;

public class Solution {
    public int solution(int n, int t){
        int answer = n;
        for(int i = 0; i < t; i++){
            answer *= 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7, 15));
    }

}
