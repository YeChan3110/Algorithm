package Programmers.레벨0.배열조각하기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;

        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < arr.length; j++){
                    if(query[i] == arr[j]){
                        answer = Arrays.copyOfRange(answer, 0, j);
                    }
                }
                
            }else{
                for(int j = 0; j < arr.length; j++){
                    if(query[i] == arr[j]){
                        answer = Arrays.copyOfRange(answer, query[i], arr.length);  
                    }
                }
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5};
        int[] b = {4,1,2};
        new Solution().solution(a, b);
    }
}
