package Programmers.레벨0.점의위치구하기;

public class Solution {
    public int solution(int[] dot) {
        int result = 0;
        String num1 = dot[0] > 0 ? "a":"b";
        String num2 = dot[1] > 0 ? "a":"b";

        result =    num1 == "a" && num2 == "a" ? 1 : 
                    num1 == "b" && num2 == "a" ? 2 : 
                    num1 == "b" && num2 == "b" ? 3 : 4 ;

        return result;
    }
}
