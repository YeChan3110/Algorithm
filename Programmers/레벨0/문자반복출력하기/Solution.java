package Programmers.레벨0.문자반복출력하기;

public class Solution {
    public StringBuilder solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++){
            answer.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("abc", 3));
    }
}
