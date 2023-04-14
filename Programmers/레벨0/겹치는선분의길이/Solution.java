package Programmers.레벨0.겹치는선분의길이;

public class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200];
        for(int i = 0; i < lines.length; i++){
            for(int j = lines[i][0] + 100; i < lines[i][1] + 100; j++){
                arr[j]++;
            }
        }

        for(int i = 0; i < 200; i++){
            if(arr[i] > 1){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        int[] arr1 = {1,5};
        int[] arr2 = {3,9};
        int[] arr3 = {1,10};
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        new Solution().solution(arr);
    }
}
