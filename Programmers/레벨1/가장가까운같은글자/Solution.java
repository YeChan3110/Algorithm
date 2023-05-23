package Programmers.레벨1.가장가까운같은글자;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int prev = -1;
    
            for (int j = i - 1; j >= 0; j--) {
                if (c == s.charAt(j)) {
                    prev = j;
                    break;
                }
            }
            
            if(prev != -1){
                answer[i] = i - prev;
            }else{
                answer[i] = -1;
            }
            
        }

        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution("banana");
    }
}
