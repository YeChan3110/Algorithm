package Programmers.레벨0.저주의숫자3;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(15);
    }
}
