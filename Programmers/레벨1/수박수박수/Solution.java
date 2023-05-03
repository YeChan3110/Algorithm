package Programmers.레벨1.수박수박수;

public class Solution {
    public String solution(int n) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while(count < n){
            if(count % 2 == 0){
                sb.append("수");
                count++;
            }else{
                sb.append("박");
                count++;
            }
        }
        return sb.toString();
    }
}
