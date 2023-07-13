package Programmers.레벨2.JadenCase문자열만들기;

public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split("");
        boolean space = true;

        for(String st : str) {
            answer += space ? st.toUpperCase() : st;
            space = st.equals(" ") ? true : false;
        }
        return answer;
    }
}
