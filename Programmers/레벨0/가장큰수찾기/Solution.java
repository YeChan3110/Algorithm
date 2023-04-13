package Programmers.레벨0.가장큰수찾기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(array);
        answer[0] = array[array.length-1];
        for(int i = 0; i < array.length; i++){
            if(copy[i] == answer[0]){
                answer[1] = i;
                break;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        new Solution().solution(a);
    }
}
