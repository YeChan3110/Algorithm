package Programmers.레벨1.가운데글자가져오기;

public class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = s.length() / 2;

        if(s.length() % 2 == 0){
            answer = s.substring(idx - 1,idx + 1);
        }else{
            answer = s.substring(idx, s.length() / 2 + 1);
        }

        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution("qwer");
    }
}
