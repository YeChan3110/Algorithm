package Programmers.레벨1.햄버거만들기;

import java.util.*;

public class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> st = new Stack<Integer>();

        for(int i : ingredient){
            st.push(i);

            if(st.size() >= 4){
                if(st.get(st.size() - 4) == 1 && st.get(st.size() - 3) == 2 && st.get(st.size() - 2) == 3 && st.get(st.size() - 1) == 4){
                    answer++;
                    for(int j = 0; j < 4; j++){
                        st.pop();
                    }
                }
            }
        }

        return answer;
    }
}
