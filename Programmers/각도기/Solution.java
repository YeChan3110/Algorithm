package Programmers.각도기;

public class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle<90){
            answer = 1;
        }
        if(angle==90){
            answer = 2;
        }
        if(90<angle && angle <180){
            answer = 3;
        }
        if(angle == 180){
            answer = 4;
        }
        return answer;
    }
}
