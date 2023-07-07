package Programmers.레벨0.접두사인지확인하기;

public class Solution {
    public int solution(String my_string, String is_prefix) {
        if(my_string.length() < is_prefix.length()){
            return 0;
        }else{
            for(int i = 0; i < is_prefix.length(); i++){
                if(my_string.charAt(i) != is_prefix.charAt(i)){
                    return 0;
                }
            }
            return 1;
        }
    }
}
