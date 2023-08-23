package Programmers.레벨2.짝지어제거하기;

import java.util.*;

public class Solution {
    public int solution(String s){
        if(s.length() %2 != 0) return 0;

        int answer = -1;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }

        }
        
        answer = (stack.size() == 0) ? 1 : 0;

        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution("cdcd");
    }
}
