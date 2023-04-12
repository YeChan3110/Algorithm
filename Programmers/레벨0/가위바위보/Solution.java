package Programmers.레벨0.가위바위보;

public class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();

        for(char c : rsp.toCharArray()){
            if(c == '2'){
                sb.append(String.valueOf(c).replace("2", "0"));
            }else if(c == '0'){
                sb.append(String.valueOf(c).replace("0", "5"));
            }else{
                sb.append(String.valueOf(c).replace("5", "2"));
            }
            
        }

        return sb.toString();
    }
}
