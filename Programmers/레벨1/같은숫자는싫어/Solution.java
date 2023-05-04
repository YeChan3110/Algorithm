package Programmers.레벨1.같은숫자는싫어;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int before = -1;

        for(int i : arr){
            if(before == i){
                continue;
            }else{
                before = i;
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] a = {1,1,3,3,0,1,1};
        new Solution().solution(a);
    }
}
