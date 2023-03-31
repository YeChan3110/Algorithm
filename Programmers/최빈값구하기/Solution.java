package Programmers.최빈값구하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int solution(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            if(map.get(array[i]) == null){
                map.put(array[i],1);
            }else{
                map.put(array[i],map.get(array[i])+1);
            }
        }

        int max = Collections.max(map.values());
        
        List<Integer> maxKeys = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == max) {
                maxKeys.add(entry.getKey());
            }
        }

        if(maxKeys.size() > 1){
            return -1;
        }else{
            return maxKeys.get(0);
        }
    }


}
