package Programmers.레벨2.이진변환반복;

public class Solution {
    static int count = 0;
    static int zero = 0;

    public int[] solution(String s) {
        int[] answer = new int[2];
        del(s);
        answer[0] = count;
        answer[1] = zero;
        return answer;
    }

    public static String del(String s){
        if(s.equals("1"))
        return "";

        int cnt = 0;

        for(char c : s.toCharArray()){
            if(c == '0'){
                cnt++;
                zero++;
            }
        }

        int length = s.length() - cnt;
        count++;
        return del(Integer.toString(length,2));
    }

    public static void main(String[] args) {
        new Solution().solution("1010");
    }
}
