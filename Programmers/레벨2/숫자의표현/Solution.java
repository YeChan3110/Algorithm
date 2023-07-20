package Programmers.레벨2.숫자의표현;

public class Solution {
    public int solution(int n) {
        if(n == 1 || n == 2) return 1;

        int answer = 0;
        
        for(int i = 0; i < n; i++){
            int temp = 0;
            for(int j = 0; j < n; j++){
                if(temp == 15){
                    answer ++;
                    break;
                }
                temp += j;
            }
        }

        return answer;
    }
}
