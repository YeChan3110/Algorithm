package Programmers.레벨0.구슬을나누는경우의수;

public class Solution {
    public int solution(int balls, int share) {
        int numer = 1;
        int denom = 1;

        for (int i = 0; i < share; i++) {
            numer *= (balls - i);
            denom *= (i + 1);
        }

        return numer / denom;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(30, 4));
        
    }
}
