package Programmers.레벨0.문자열안에문자열;

public class Solution {
    public int solution(String str1, String str2){
        int answer = 0;
        if(str1.contains(str2)){
            return 1;
        }else{
            return 2;
        }
    }
}
