package Programmers.레벨1.시저암호;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == ' '){
                answer.append(' ');
            }else if(c >= 65 && c <= 90){
                if(c + n > 90){
                    answer.append((char)(((c + n) - 26)));
                }else{
                    answer.append((char)(c + n));
                }
            }else if(c >= 97 && c <= 122){
                if(c + n > 122){
                    answer.append((char)(((c + n) -26)));
                }else{
                    answer.append((char)(c + n));
                }
            }else{
                answer.append(c);
            }
        }
        
        System.out.println(answer);
        return answer.toString();
    }
    public static void main(String[] args) {
        new Solution().solution("a B z",4);
    }
}
