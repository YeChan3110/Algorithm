package Programmers.레벨0.z2의영역;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 0;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 2){
                target = 1;
                list.add(i);
                for(int j = i+1 ; j < arr.length; i++){
                    list.add(j);
                    if(arr[j] == 2){
                        break;
                    }
                }
            }
        }
        
        if(target == 0){list.add(-1);}

        int[] answer = new int[list.size()];

        return answer;
    }
}
