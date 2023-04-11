package Programmers.레벨0.양꼬치;

public class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int free = (n/10) * 2000;
        answer = (n * 12000 + k * 2000) - free;
        return answer;
    }
}
