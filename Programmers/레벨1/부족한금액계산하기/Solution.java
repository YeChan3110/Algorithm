package Programmers.레벨1.부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for(long i = 1; i <= count; i++){  
            answer += (long)price * i;
        }

        if(money - answer < 0){
            answer = Math.abs(money - answer);
        }else if(money - answer >= 0){
            answer = 0;
        }
        
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(3, 50, 4);
    }
}
