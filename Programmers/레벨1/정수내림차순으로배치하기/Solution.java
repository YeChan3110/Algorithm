package Programmers.레벨1.정수내림차순으로배치하기;

import java.util.*;
public class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(char c : String.valueOf(n).toCharArray()){
            list.add(String.valueOf(c));
        }

        list.sort(Comparator.reverseOrder());
        
        for(String s : list){
            sb.append(s);
        }
        
        answer = Long.parseLong(sb.toString());
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(118372);
    }
    
}
