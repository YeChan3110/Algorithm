package Programmers.레벨0.원소들의곱과합;

public class Solution {
    public int solution(int[] num_list) {
        int a = num_list[0]; 
        int b = num_list[0]; 
    
        for (int i : num_list) {
            a += i;
            b *= i;
        }
        
        a = a * a; 
    
        int answer = (a > b) ? 1 : 0;
        return answer;
    }
}
