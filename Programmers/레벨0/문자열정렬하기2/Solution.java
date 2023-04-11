package Programmers.레벨0.문자열정렬하기2;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string){
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);

        // String answer = "";
        // StringBuilder sb = new StringBuilder();

        // char[] c = my_string.toLowerCase().toCharArray();
        // int[] asciiArr = new int[c.length];
        
        // for(int i = 0; i < c.length; i++){
        //     asciiArr[i] = (int)c[i];
        // }
        
        // for(int i = 1; i < asciiArr.length; i++){
        //     int cur = asciiArr[i];
        //     int j = i - 1;
        //     while(j >= 0 && asciiArr[j] > cur){
        //         asciiArr[j + 1] = asciiArr[j];
        //         j--;
        //     }
        //     asciiArr[j + 1] = cur;
        // }
        
        // for(int i : asciiArr){
        //     sb.append((char)i);
        // }

        // answer = sb.toString();

        // return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("stRinG"));
    }
}
