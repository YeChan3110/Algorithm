package Programmers.레벨1.폰켓몬;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        
        if(set.size() > nums.length / 2){
            answer = nums.length / 2;
        }else{
            answer = set.size();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        new Solution().solution(nums);
    }
}
