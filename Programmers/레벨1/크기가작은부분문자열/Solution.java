package Programmers.레벨1.크기가작은부분문자열;


public class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int range = (t.length() - p.length()) + 1;

        for(int i = 0; i < range; i++){
            int num = Integer.parseInt(t.substring(i, (p.length()) + i));
            if(num <= Integer.parseInt(p)){
                answer ++;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution("500220839878", "7");
    }   
}
