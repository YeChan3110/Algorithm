package Programmers.레벨2.기능개발;

import java.util.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> release = new ArrayList<>();
        int maxDays = -1;
        int count = 0;
    
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
    
            if (days > maxDays) {
                if (maxDays != -1) {
                    release.add(count);
                }
    
                maxDays = days;
                count = 1;
            } else {
                count++;
            }
        }
    
        release.add(count);
    
        int[] answer = new int[release.size()];
    
        for (int i = 0; i < answer.length; i++) {
            answer[i] = release.get(i);
            System.out.println(answer[i]);
        }
    
        return answer;
    }
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        new Solution().solution(progresses,speeds);
    }
}
