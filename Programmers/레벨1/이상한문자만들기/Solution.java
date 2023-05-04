package Programmers.레벨1.이상한문자만들기;

public class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int btn = 0;
        for(char c : s.toCharArray()){
            if(btn == 0){
                btn = 1;
                sb.append(String.valueOf(c).toUpperCase());
            }else{
                btn = 0;
                sb.append(String.valueOf(c).toLowerCase());
            }
        }
        answer = sb.toString();
        System.out.println(sb.toString().indexOf(0));
        if(answer.charAt(0) == ' '){
            answer = sb.toString().substring(1);
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(" try hello world");
    }
}
