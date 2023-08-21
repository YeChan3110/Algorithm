package Programmers.레벨2.구명보트;

import java.util.*;

public class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int weight : people){
            list.add(weight);
        }
        
        int left = 0;
        int right = list.size() - 1;

        while(left <= right) {
            if(list.get(left) + list.get(right) <= limit) {
                left++;
            }
            right--;
            answer++;
        }
        
        return answer;
    }
    public static void main(String[] args) {
        int[] people = {70,80,50};
        int limit = 100;
        new Solution().solution(people,limit);
    }

}
