package Programmers.문자열밀기;

public class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String a = A;
        
        for(int i = 0 ; i < A.length(); i++){
            if(a.equals(B)){
                return answer;
            }
            String cut = a.substring(A.length()-1);
            a = cut + a.substring(0,A.length()-1);
            answer ++;
        }
        
        return -1;
    }
}
