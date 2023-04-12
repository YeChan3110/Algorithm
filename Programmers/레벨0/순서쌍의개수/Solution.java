package Programmers.레벨0.순서쌍의개수;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;

        for(int i = 0; i < n; i++){
            if(n % a == 0){
                answer += 1;
            }
            a++;
        }
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(20);
    }
}
