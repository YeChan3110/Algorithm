package Programmers.레벨1.추억점수;

import java.util.*;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                if(map.get(photo[i][j]) != null){
                    answer[i] += map.get(photo[i][j]);
                }
            }
        }

        for(int i : answer){
            System.out.println(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5,10,1,3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        new Solution().solution(name, yearning, photo);
    }
}
