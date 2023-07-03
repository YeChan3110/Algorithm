package Programmers.레벨1.카드뭉치;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";


        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < goal.length; ++i) {

            if (cards1.length > idx1 && goal[i].equals(cards1[idx1])) {
                idx1++;
            } else if (cards2.length > idx2 && goal[i].equals(cards2[idx2])) {
                idx2++;
            } else {
                answer = "No";
                return answer;
            }
        }

        return answer;
    }
}
