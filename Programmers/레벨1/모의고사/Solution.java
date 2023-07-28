package Programmers.레벨1.모의고사;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] answers) {
        int[] fir = {1,2,3,4,5};
        int[] sec = {2,1,2,3,2,4,2,5};
        int[] thi = {3,3,1,1,2,2,4,4,5,5};

        int fircnt = count(fir, answers);
        int seccnt = count(sec, answers);
        int thicnt = count(thi, answers);

        int maxCount = Math.max(fircnt, Math.max(seccnt, thicnt));

        ArrayList<Integer> answerList = new ArrayList<>();
        
        if (fircnt == maxCount) {
            answerList.add(1);
        }
        if (seccnt == maxCount) {
            answerList.add(2);
        }
        if (thicnt == maxCount) {
            answerList.add(3);
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public int count(int[] arr, int[] answers) {
        int answer = 0;
        int arrcnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr[arrcnt]) {
                answer++;
            }
            
            arrcnt++;
            
            if (arrcnt == arr.length) {
                arrcnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        new Solution().solution(answers);
    }
}
