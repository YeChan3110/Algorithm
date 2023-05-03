package Programmers.레벨1.하샤드수;

public class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;

        for(char c : String.valueOf(x).toCharArray()){
            num += Integer.parseInt(String.valueOf(c));
        }

        if(x % num != 0){
            answer = false;
        }
        
        return answer;
    }
}
