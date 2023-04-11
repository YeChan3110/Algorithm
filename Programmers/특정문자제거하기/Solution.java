package Programmers.특정문자제거하기;

public class Solution {
    public StringBuilder solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        char let = letter.charAt(0);
        for(int i = 0 ; i < my_string.length(); i ++){
            if(my_string.charAt(i) == let){
                continue;
            }
            answer.append(my_string.charAt(i));
        }
        return answer;
        // String answer = "";
        // answer = my_string.replace(letter,"");
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solution("string", "s"));
    }
}
