package Programmers.레벨1.완주하지못한선수;

import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for(String s : participant){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s : completion){
            map.put(s, map.getOrDefault(s, 0) - 1);
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            if (value == 1 || value == -1) {
                answer = key;
            }
        }

        return answer;
    }
}
