package Programmers.레벨0.주사위의개수;

public class Solution {
    public int solution(int[] box, int n) {
        int a = box[0] / n;
        int b = box[1] / n;
        int c = box[2] / n;
        return a*b*c;
    }
}
