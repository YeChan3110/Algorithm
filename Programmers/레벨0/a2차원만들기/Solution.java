package Programmers.레벨0.a2차원만들기;

public class Solution {
    public int[][] solution(int[] num_list, int n) {
        int size = (int) Math.ceil((double) num_list.length / n);
        int[][] answer = new int[size][n];
        int[] insert = new int[n];
        int count = 0;
        int num = 0;

        for(int i : num_list){
            System.out.println("==========");
            System.out.println(insert[0]);
            System.out.println(insert[1]);
            System.out.println("==========");
            if(insert[insert.length-1] != 0){
                answer[count] = insert;
                insert = new int[n];
                count++;
                num = 0;
                System.out.println(answer);
            }

            insert[num] = i;
            num++;
        }

        if(num != 0){
            answer[count] = insert;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        new Solution().solution(arr, 2);
    }
}
