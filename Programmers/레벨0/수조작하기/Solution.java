package Programmers.레벨0.수조작하기;

public class Solution {
    public int solution(int n, String control) {
        for(char c : control.toCharArray()){
            if(c == 'w') {
                n += 1;
            }else if(c == 's'){
                n -= 1;
            }else if(c == 'd'){
                n += 10;
            }else if(c == 'a'){
                n -= 10;
            }
        }
        return n;
    }
}
