package Programmers.레벨1.두개뽑아서더하기;

import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {
        // hashset 이 아닌 Treeset을 이용하면 중복검사를 하면서 정렬도 된다고 함
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[set.size()];
        int index = 0;
        for (Integer i : set) {
            answer[index++] = i;
        }

        for(int i = 0; i < answer.length; i++){
            for(int j = i + 1; j < answer.length; j++){
                if(answer[i] >= answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        new Solution().solution(numbers);
    }
}
