package Programmers.레벨2.짝지어제거하기;

import java.util.*;

public class Solution {
    public int solution(String s){
        int answer = 0;
        ArrayList<Character> list = new ArrayList<>();
        boolean play = true;

        for(char c : s.toCharArray()){
            list.add(c);
        }

        list.add('0');

        while(play){
            if(list.get(0) == '0') {
                answer = 1;
                break;
            }

            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i) == list.get(i + 1)){
                    list.remove(i + 1);
                    list.remove(i);
                    break;
                }

                if(i + 2 == list.size()){
                    play = false;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution("cdcd");
    }
}
