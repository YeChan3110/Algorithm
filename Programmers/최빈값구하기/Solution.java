package Programmers.최빈값구하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();

        int[] arr = {1,2,3,4,5,6,8,8,7,7};

        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);

        // 최대 횟수
        int max = Collections.max(map.values());
        
        List<Integer> maxKeys = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == max) {
                maxKeys.add(entry.getKey());
            }
        }

        if(maxKeys.size() > 1){
            System.out.println("큼");
        }
    }
}
