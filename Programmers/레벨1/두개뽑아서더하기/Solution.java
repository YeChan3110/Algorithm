package Programmers.레벨1.두개뽑아서더하기;

import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++){
            int index = i;
            for(int j = 0; j < numbers.length; j++){
                if(index == j){
                    continue;
                }else{
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        System.out.println(list);

        HashSet<Integer> distinctSet = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            boolean isExist = false;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                distinctSet.add(list.get(i));
            }
        }
        
        int[] answer = new int[distinctSet.size()];
        int index = 0;
        for (Integer element : distinctSet) {
            answer[index++] = element;
        }
        
        for(int i : answer){
            System.out.println(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        new Solution().solution(numbers);
    }
}
