package Programmers.레벨1.소수만들기;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length-2; i++) {

            for(int j = i+1; j < nums.length-1; j++) {

                for(int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }

    private boolean isPrime(int number) {
        for(int i = 2; i <= number/2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
