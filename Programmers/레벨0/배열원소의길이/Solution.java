package Programmers.레벨0.배열원소의길이;

import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(String[] strlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(String str : strlist){
            arr.add(str.length());
        }
        return arr;
    }
}
