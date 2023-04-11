package Programmers.레벨0.다음에올숫자;

import java.util.Scanner;

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if((common[1] - common[0]) == (common[2] - common[1])){
            answer = common[common.length-1] + (common[1] - common[0]);
        }else{
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        
        return answer;
    }
    public static void main(String[] args) {
        Solution sl = new Solution();
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        
        for(int i = 0; i < 3; i++){
            int val = sc.nextInt();
            arr[i] = val;
        }

        System.out.println("answer : " + sl.solution(arr));
    }
}

