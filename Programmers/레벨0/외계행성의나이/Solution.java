package Programmers.레벨0.외계행성의나이;

import javax.xml.transform.SourceLocator;

public class Solution {
    public String solution(int age) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        String str = Integer.toString(age);

        for(int i = 0; i < str.length(); i++){
            int a = Character.getNumericValue(str.charAt(i));
            sb.append(alpha.charAt(a));
        }
        return sb.toString();
    }  
    public static void main(String[] args) {
        new Solution().solution(55);
    }
}
