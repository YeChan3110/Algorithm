package Programmers.레벨1.이2016년;

public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] daysPerMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
        int daysIndex = 0;
      
        for(int i = 0; i < a - 1; i++){
            daysIndex += daysPerMonth[i];
        }

        daysIndex += b - 1;
        
        answer = days[daysIndex % 7];
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution(1, 17);
    }
}
