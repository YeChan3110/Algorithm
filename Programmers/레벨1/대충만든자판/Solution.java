package Programmers.레벨1.대충만든자판;

import java.util.*;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        List<Map<Integer,Integer>> times = new ArrayList<>();
        int index = 0;

        for(int i = 0; i < targets.length; i++){
            for(char c : targets[i].toCharArray()){
            
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] a = {"ABACD","BCEFD"};
        String[] b = {"ABCD","AABB"};
        new Solution().solution(a, b);
    }
}
