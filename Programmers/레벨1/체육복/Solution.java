package Programmers.레벨1.체육복;

import java.util.*;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < lost.length; i++){
            map.put(lost[i], 0);
        }

        for(int i = 0; i < reserve.length; i++){
            map.put(reserve[i],1);
        }

        for(int i = 0; i < lost.length; i++){
            if(map.get(reserve[lost[i] - 1]) == 1){
                map.put(lost[i], 1);   
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();


        }

        return answer;
    }
}
