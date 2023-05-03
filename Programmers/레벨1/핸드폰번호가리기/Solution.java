package Programmers.레벨1.핸드폰번호가리기;

public class Solution {
    public String solution(String phone_number) {
        char[] ca = phone_number.toCharArray();
        for(int i = 0; i < ca.length - 4; i++){
            ca[i] = '*';
        }
        return String.valueOf(ca);
    }
}
