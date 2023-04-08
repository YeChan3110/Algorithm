package Programmers.분수의덧셈;

import java.util.Arrays;

public class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = (numer1 * denom2) + (numer2 * denom1); 
        int denominator = denom1 * denom2;
        
        for(int i = numerator-1; i > 1; i--) {
            if(numerator % i == 0 && denominator % i == 0) { 
                numerator /= i;
                denominator /= i;
            }
        }
        
        int[] answer = { numerator, denominator };
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(9, 2, 1, 3)));
    }
}
