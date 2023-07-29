package Programmers.레벨0.저주의숫자3;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 0; i < n; i ++){
            answer ++;

            if(answer % 3 == 0){
                answer ++;
            }
            while(String.valueOf(answer).contains("3")){
                answer ++;
            }
            System.out.println("i : " + (i+1) + " // answer : " + answer);
        }

        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(15);
    }
}
