package Programmers.레벨1.서울에서김서방찾기;

import java.util.Arrays;

public class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int location = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 " + location + "에 있다";
        return answer;
    }
}
