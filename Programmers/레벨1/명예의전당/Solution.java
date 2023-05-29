package Programmers.레벨1.명예의전당;

public class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] honor = new int[k];

        for(int i = 0 ; i < k ; i++){
            honor[i] = score[i];
        }

        // for(int i = 0; i < honor.length; i++){
            
        // }
        
        for(int i : honor){
            System.out.println(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {1,2,3,4,5};
        new Solution().solution(k, score);
    }
}