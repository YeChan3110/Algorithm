package Programmers.레벨0.삼각형의완성조건;

import java.util.Arrays;

public class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = sides[2] >= (sides[0] + sides[1]) ? 2 : 1;
        return answer;
    }
}
