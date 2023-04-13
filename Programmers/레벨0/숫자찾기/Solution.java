package Programmers.레벨0.숫자찾기;

public class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numstr = Integer.toString(num);
        String kstr = Integer.toString(k);
        for(char c : numstr.toCharArray()){
            if(c == kstr.toCharArray()[0]){
                answer = numstr.indexOf(c)+1;
                break;
            }
            else{
                answer = -1;
            }
        }
        return answer;
    } 
}
