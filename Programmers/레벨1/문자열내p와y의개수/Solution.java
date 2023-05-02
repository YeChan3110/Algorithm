package Programmers.레벨1.문자열내p와y의개수;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for(char c : s.toLowerCase().toCharArray()){
            if(c == 'p'){
                p++;
            }else if(c == 'y'){
                y++;
            }
        }

        if(p != y){
            answer = false;
        }

        return answer;
    }
}
