package Programmers.레벨0.문자열뒤집기;

public class Solution {
    public StringBuilder solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i <= my_string.length(); i++){
            char c = my_string.charAt(my_string.length()-i);
            answer.append(c);
        }
        return answer;
    } 

    public static void main(String[] args) {
        System.out.println(new Solution().solution("jaron"));
    }
}
