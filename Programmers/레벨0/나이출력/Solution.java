package Programmers.레벨0.나이출력;

import java.time.LocalDate;

public class Solution {
    public int solution(int age) {
        int answer = 0;
        LocalDate date = LocalDate.now();
        answer = date.getYear() - age;
        return answer;
    } 
    public static void main(String[] args) {
        System.out.println(new Solution().solution(40));
        
    }
}
