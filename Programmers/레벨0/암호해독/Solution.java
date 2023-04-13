package Programmers.레벨0.암호해독;

public class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        int multi = 0;

        for(int i = 0; i < cipher.length()/code;i++){
            if(multi == 0) multi = code;
            sb.append(cipher.charAt(code-1));
            multi += code;
        }
        
        return sb.toString();
    }
}
