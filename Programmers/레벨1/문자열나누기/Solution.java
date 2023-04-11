package Programmers.레벨1.문자열나누기;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        int a = 0;
        int b = 0;
        char fir = ' ';

        for(int i = 0; i < s.length(); i++){
            if(fir == ' ') fir = s.charAt(i);

            if(fir == s.charAt(i)) a++;

            if(fir != s.charAt(i)) b++;

            if(a != 0 && b != 0 && a == b){
                answer++;
                a = 0;
                b = 0;
                fir = ' ';
            }
        }

        if(fir != ' ') answer ++;
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution().solution("banana"));
    }
}
