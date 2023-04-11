package Programmers.배열뒤집기;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int a = num_list.length -1;
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[a];
            a -= 1;
        }
        return answer;
    }
}
