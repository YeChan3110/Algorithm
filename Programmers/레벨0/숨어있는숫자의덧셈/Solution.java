package Programmers.레벨0.숨어있는숫자의덧셈;

import java.util.ArrayList;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String regex = "[0-9]";
        ArrayList<Integer> arr = new ArrayList<>();

        for(char c : my_string.toCharArray()){
            if(String.valueOf(c).matches(regex)){
                arr.add(my_string.indexOf(c));
            }
        }

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i+1) - arr.get(i) != 1){
                answer += Integer.parseInt(String.valueOf(my_string.charAt(arr.get(i))));
            }
        }

        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution("aAb1B2cC34oOp");
    }
}
