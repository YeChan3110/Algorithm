package Programmers.레벨0.무작위로K개의수뽑기;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new HashSet<>();
        int[] kArr = new int[arr.length]; 
        int idx = 0;
        
        for(int num : arr) {
            if(!set.contains(num)) {
                set.add(num);
                kArr[idx++] = num;
            }
        }

        int length = idx;

        for(int i = 0; i < answer.length; i++) {
            if(length != 0) {
                length--;
                answer[i] = kArr[i];
            }else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}
