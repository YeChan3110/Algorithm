package Programmers.x7의개수;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array){
        int answer = 0;

        for(int i = 0; i < array.length; i++){
            String num = Integer.toString(array[i]);
            System.out.println(num[i].chars());
            answer += num.chars().filter(a -> a == '7').count();
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {7,77,777};
        System.out.println(s.solution(arr));
        
    }
}
