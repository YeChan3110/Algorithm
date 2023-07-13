package Programmers.레벨2.JadenCase문자열만들기;

public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split("");
        boolean space = true;

        for (String st : str) {
            if (space) {
                answer += st.toUpperCase();
            } else {
                answer += st;
            }
            space = st.equals(" ");
        }

        return answer;
    }
}
