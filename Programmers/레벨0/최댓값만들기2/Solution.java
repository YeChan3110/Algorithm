package Programmers.레벨0.최댓값만들기2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        if(numbers[0] * numbers[1] > numbers[numbers.length-1] * numbers[numbers.length-2]){
            answer = numbers[0] * numbers[1];
        }else{
            answer =numbers[numbers.length-1] * numbers[numbers.length-2];
        }
        // Math의 max함수를 쓰면 더 간단
        return answer;
    }
}
