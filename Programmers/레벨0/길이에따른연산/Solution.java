package Programmers.레벨0.길이에따른연산;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length < 11){
            for(int i : num_list){
                answer *= i;
            }
        }else{
            for(int i : num_list){
                answer += i;
            }
            answer = answer - 1;
        }
        return answer;
    }
}
