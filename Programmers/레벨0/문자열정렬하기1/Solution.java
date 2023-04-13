package Programmers.레벨0.문자열정렬하기1;

import java.util.ArrayList;

public class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> arr = new ArrayList<>();
        String regex = "[0-9]";

        for(char c : my_string.toCharArray()){
            String a = String.valueOf(c);
            if(String.valueOf(c).matches(regex)){
                arr.add(String.valueOf(c));
            }
        }
        System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        new Solution().solution("1n2n3n4n");
    }
}
