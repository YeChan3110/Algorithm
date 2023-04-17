package Programmers.레벨0.숨어있는숫자의덧셈;

import java.util.regex.*;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(my_string);

        while (matcher.find()) {
            String match = matcher.group();
            answer += Integer.parseInt(match);
        }

        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution("aAb1B2cC34oOp");
    }
}
