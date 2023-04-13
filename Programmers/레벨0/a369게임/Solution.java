package Programmers.레벨0.a369게임;

public class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        for(char c : str.toCharArray()){
            if(c == '3' || c == '6' || c == '9'){
                answer ++;
            }
        }
        return answer;
    }
}
