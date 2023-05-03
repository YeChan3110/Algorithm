package Programmers.레벨1.예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;

        Arrays.sort(d);

        for(int i : d){
            count += i;
            if(count <= budget){
                break;
            }else{
                answer ++;
            }
        }
        
        return answer;
    }
}
