package Programmers.레벨1.나누어떨어지는숫자배열;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);

        for(int i : arr){
            if(i % divisor == 0){
                list.add(i);
            }
        }

        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }

        return answer;
    }
}
