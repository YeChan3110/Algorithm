package Programmers.레벨0.A로B만들기;

import java.util.ArrayList;

public class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int count = 0;
        ArrayList<String> list = new ArrayList<>();

        for(char c : before.toCharArray()){
            list.add(String.valueOf(c));
            count++;
        }

        for(char c : after.toCharArray()){
            if(list.contains(String.valueOf(c))){
                list.remove(String.valueOf(c));
                count--;
            }
        }

        return answer = count == 0 ? 1 : 0;
    }
}
