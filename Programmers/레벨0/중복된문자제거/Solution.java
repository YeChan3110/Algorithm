package Programmers.레벨0.중복된문자제거;

import java.util.ArrayList;

public class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();

        for(char c : my_string.toCharArray()){
            if(!list.contains(String.valueOf(c))){
                list.add(String.valueOf(c));
            }
        }
        
        for(int i = 0; i < list.size();i++){
            sb.append(list.get(i));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        new Solution().solution("people");
    }
}
