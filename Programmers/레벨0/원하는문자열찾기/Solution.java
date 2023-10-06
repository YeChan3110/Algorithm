package Programmers.레벨0.원하는문자열찾기;

public class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if (myString.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
