package Programmers.레벨1.문자열내마음대로정렬하기;

import java.util.*;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        answer = new String[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        new Solution().solution(strings, n);
    }
}
