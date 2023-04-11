package Programmers.레벨0.배열의평균값;

import java.util.Arrays;

public class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int num = 0;
        for(int i = 0; i < numbers.length; i++){
            num += numbers[i];
        }
        answer = (double)num/numbers.length;
        return answer;
    } 
}
