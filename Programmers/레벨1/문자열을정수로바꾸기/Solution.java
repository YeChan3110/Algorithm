package Programmers.레벨1.문자열을정수로바꾸기;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.contains("-")){
            answer = Integer.parseInt(s);
        }else{
            if(s.contains("+")){
                answer = Integer.parseInt(s.substring(1, s.length()));
            }else{
                answer = Integer.parseInt(s);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution("-143");
    }
}
