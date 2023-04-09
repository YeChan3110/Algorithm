package Programmers.배열두배만들기;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};
        System.out.println(new Solution().solution(i));
    }
}
