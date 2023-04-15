package Programmers.레벨0.k의개수;

public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            StringBuilder sb = new StringBuilder();
            sb.append(l);

            int length = sb.length();

            for (int r = 0; r < length; r++) {
                if ((sb.charAt(r) - '0') == k) {
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(10, 50, 5);
    }
}
