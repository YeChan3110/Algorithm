package Programmers.레벨1.자연수뒤집어배열로만들기;

import java.util.ArrayList;

public class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = String.valueOf(n).length() - 1; i >= 0; i--) {
            list.add(Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i))));
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
