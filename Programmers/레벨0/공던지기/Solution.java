package Programmers.레벨0.공던지기;

public class Solution {
    public int solution(int[] numbers, int k) {
        int answer = numbers[2 * (k - 1) % numbers.length];
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        new Solution().solution(a, 5);
    }
}
