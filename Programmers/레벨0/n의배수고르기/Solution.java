package Programmers.레벨0.n의배수고르기;

import java.util.*;

public class Solution {
    public Object[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                list.add(numlist[i]);
            }
        }

        return list.toArray();
    }
}
