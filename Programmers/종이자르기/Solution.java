package Programmers.종이자르기;

import java.util.Scanner;

public class Solution {
    public int solution(int M, int N){
        int answer = 0;
        answer = M * N -1;
        return answer;
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.println(sl.solution(sc.nextInt(), sc.nextInt()));
    }
}
