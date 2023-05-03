package Programmers.레벨1.문자열다루기기본;

public class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String regex = "\\d*";
        // 길이까지 할수 있음 : "^[0-9]{4}|{6}$"
        if(s.length() == 4 || s.length() == 6){
            if(s.matches(regex)){
                answer = true;
            }else{
                answer = false;
            }
        }else{
            answer = false;
        }

        return answer;
    }
}
