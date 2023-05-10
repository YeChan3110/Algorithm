package Programmers.레벨1.문자열내마음대로정렬하기;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] firArr = new String[strings.length];
        String[] secArr = new String[strings.length];
        int fir = 0;

        for(int i = 0; i < strings.length; i++){
            firArr[i] = strings[i].substring(n,n + 1) + i;
        }

        Arrays.sort(firArr);

        for(int i = 0; i < firArr.length; i++){
            for(int j = 0; j < firArr.length; j++){
                if(firArr[i].substring(0, 1).equals(firArr[j].substring(0, 1))){
                    if(fir == 0){
                        System.out.println("str : " + strings[i]);
                        secArr[i] = strings[i];
                        fir++;
                    }else{
                        secArr[i] = strings[j];
                    }
                    
                }
            }
        }
        for(String str : secArr){
            System.out.println(str);
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        new Solution().solution(strings, n);
    }
}
