package Programmers.레벨0.인덱스바꾸기;

public class Solution {
    public String solution(String my_string, int num1, int num2) {
        char c1 = my_string.charAt(num1);
        char c2 = my_string.charAt(num2);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++){
            if(i == num1) {
                sb.append(c2);
                continue;
            }
            if(i == num2) {
                sb.append(c1); 
                continue;
            } 
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        new Solution().solution("abcde", 0, 1);
    }
}
