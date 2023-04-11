package Programmers.레벨0.중앙값구하기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        if(array.length == 1){
            answer = array[0];
        }
        answer = array[array.length/2];
        return answer;
    } 
}
