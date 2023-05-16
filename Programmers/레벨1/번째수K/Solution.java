package Programmers.레벨1.번째수K;

import java.util.*;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            ArrayList<Integer> tempList = new ArrayList<>();
            
            for(int j = commands[i][0] - 1; j < commands[i][1]; j ++){
                tempList.add(array[j]);
            }

            int[] tempArray = new int[tempList.size()];
            
            for(int j = 0; j < tempList.size(); j ++){
                tempArray[j] = tempList.get(j);
            }

            Arrays.sort(tempArray);
            answer[i] = tempArray[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        new Solution().solution(array,commands);
    }
}
