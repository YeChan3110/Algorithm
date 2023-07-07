package Programmers.레벨0.문자열앞의n글자;

public class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append(my_string.toCharArray()[i]);
        }
        
        return sb.toString();
    }
}
