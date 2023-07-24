package Programmers.레벨0.주사위게임3;

import java.util.*;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int p = 0;
        int q = 0;
        int answer = 0;

        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        if (map.containsValue(4)) {
            answer = 1111 * a;
        }else if(map.containsValue(3)){
            for(Map.Entry<Integer,Integer> m : map.entrySet()){
                if(m.getValue() == 3){
                    p = m.getKey();
                }
                if(m.getValue() == 1){
                    q = m.getKey();
                }
            }
            int temp = (10 * p) + q;
            answer = temp * temp;
        }else if(map.containsValue(2)){
            if(map.size() == 2){
                for(Map.Entry<Integer,Integer> m : map.entrySet()){
                    if(p == 0){
                        p = m.getKey();
                    }else{
                        q = m.getKey();
                    }
                }
                int abs = p - q;

                if(p - q < 0){
                    abs = (p - q) + ((p - q) * -2);
                }

                answer = (p + q) * abs;
            }

            if(map.size() == 3){
                for(Map.Entry<Integer,Integer> m : map.entrySet()){
                    if(m.getValue() == 1){
                        if(p == 0){
                            p = m.getKey();
                        }else{
                            q = m.getKey();
                        }
                    }
                }
                answer = (p * q);
            }
        }else{
            for(Map.Entry<Integer,Integer> m : map.entrySet()){
                if(answer == 0 || answer > m.getKey()){
                    answer = m.getKey();
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution(6,4,2,5);
    }
}
