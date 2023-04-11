package Programmers.레벨0.진료순서정하기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] arr = Arrays.copyOf(emergency, emergency.length);
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(emergency);
        
        for(int i = 0; i < emergency.length; i++){
            map.put(emergency[i],emergency.length-i);
        }

        for(int i = 0; i < emergency.length; i++){
            answer[i] = map.get(arr[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {77, 66, 88, 33, 99};
        new Solution().solution(arr);
    }

}
