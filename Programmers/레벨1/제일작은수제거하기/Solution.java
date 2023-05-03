package Programmers.레벨1.제일작은수제거하기;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int small = 0;

        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }

        for(int i : arr){
            if(small == 0){
                small = i;
            }else if(i < small){
                small = i;
            };
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != small){
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] a = {-4,3,2,1};
        new Solution().solution(a);
    }
}
