package Programmers.레벨0.정수찾기;

public class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for(int i : num_list){
            if(i == n){
                return 1;
            }
        }

        return answer;
    }
}
