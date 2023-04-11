package Programmers.레벨0.x7의개수;

public class Solution {
    public int solution(int[] array){
        int answer = 0;

        for(int i = 0; i < array.length; i++){
            String num = Integer.toString(array[i]);
            answer += num.chars().filter(a -> a == '7').count();
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {7,77,777};
        System.out.println(s.solution(arr));
        
    }
}
