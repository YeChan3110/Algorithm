package Programmers.레벨0.개미군단;

public class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 5;
        int soldier = 3;
        int ant = 1;
        
        if(hp / general >= 1){
            answer += hp / general;
            hp = hp % general;
        }

        if(hp / soldier >= 1){
            answer += hp / soldier;
            hp = hp % soldier;
        }

        if(hp / ant >= 1){
            answer += hp / ant;
            hp = hp % ant;
        }

        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(5);
    }
}
