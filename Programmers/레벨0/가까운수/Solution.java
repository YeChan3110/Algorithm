package Programmers.레벨0.가까운수;

import java.util.Arrays;

public class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            int idx = 0;
            int[] newArr = new int[array.length+1];
            for(int i = 0; i < array.length; i++){
                newArr[i] = array[i];
            }
            newArr[array.length] = n;

            Arrays.sort(newArr);

            for(int i = 0; i < newArr.length; i++){
                if(newArr[i]==n){
                    idx = i;
                    break;
                } 
            }

            if(idx != 0 && idx != newArr.length-1){
                if(Math.abs(newArr[idx-1] - newArr[idx]) > Math.abs(newArr[idx+1] - newArr[idx])){
                    answer = newArr[idx+1];
                }else{
                    answer = newArr[idx-1];
                }    
            }

            if(idx == 0){
                answer = newArr[1];
            }
            if(idx == newArr.length-1){
                answer = newArr[newArr.length-2];
            }

            return answer;
        } 
    public static void main(String[] args) {
        int[] a = {10,11,12};
        new Solution().solution(a, 13);
    }
}
