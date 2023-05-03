package Programmers.레벨1.약수의개수와덧셈;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left ; i <= right; i++){
            int temp = 0;

            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    temp++;
                }
            }

            if(temp % 2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(13, 17);
    }
}
