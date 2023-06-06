package Programmers.레벨0.치킨쿠폰;

public class Solution {
    public int solution(int chicken) {
        int answer = 0;
        System.out.println(chicken);
        while(chicken > 10){
            System.out.println(chicken);
            answer += chicken / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution(100);
    }
}
