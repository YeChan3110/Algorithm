package Programmers.레벨2.이진변환반복;

public class Solution {
    static int count = 0;
    static int zero = 0;

    public int[] solution(String s) {
        int[] answer = {};
        System.out.println(del(s));
        System.out.println(count);
        System.out.println(zero);
        return answer;
    }

    public static String del(String s){

        for(char c : s.toCharArray()){
            if(c == '0'){
                zero++;
            }
        }

        if(s.equals("10")){
            count++;
            zero++;
            return "1";
        }

        return s;
    }

    public static void main(String[] args) {
        new Solution().solution("1010");
    }
}
