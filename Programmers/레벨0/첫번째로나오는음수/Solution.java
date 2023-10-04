package Programmers.레벨0.첫번째로나오는음수;

public class Solution {
    public int solution(int[] num_list){
        int answer = 0;

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0){
                answer = i;
                break;
            }
            answer = -1;
        }
        
        return answer;
    }
}
