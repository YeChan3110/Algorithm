package Programmers.레벨1.숫자문자열과영단어;

public class Solution {
    public static int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replaceAll(arr[i], Integer.toString(i));
            }
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        new Solution().solution("one4seveneight");
    }
}
