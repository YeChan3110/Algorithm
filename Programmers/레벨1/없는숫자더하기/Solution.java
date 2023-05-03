package Programmers.레벨1.없는숫자더하기;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i : numbers){
            answer -= i;
        }
        return answer;
    }
}
