package Programmers.레벨0.공배수;

public class Solution {
    public int solution(int number, int n, int m) {
       
        int answer = 0;
        if(number % n == 0 && number % m == 0){
            answer = 1;
        }
        return answer;
        
    }
}
