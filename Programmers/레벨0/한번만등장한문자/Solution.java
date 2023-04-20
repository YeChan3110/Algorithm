package Programmers.레벨0.한번만등장한문자;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder ban = new StringBuilder();

        for(char c : s.toCharArray()){
            if(ban.toString().contains(String.valueOf(c))){
                continue;
            }
            if(sb.toString().contains(String.valueOf(c))){
                ban.append(c);
                sb = new StringBuilder(sb.toString().replace(String.valueOf(c), ""));
                continue;
            }
            if(!sb.toString().contains(String.valueOf(c))){
                sb.append(c);
            }
        }
        char[] cArr = sb.toString().toCharArray();
        Arrays.sort(cArr);
        sb = new StringBuilder(new String(cArr));
        answer = sb.toString();
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcabcadc"));
    }
}
