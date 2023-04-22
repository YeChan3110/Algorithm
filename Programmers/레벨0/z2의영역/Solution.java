package Programmers.레벨0.z2의영역;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int startIdx = -1;
        int endIdx = -1;
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (startIdx == -1) {
                    startIdx = i;
                }
                endIdx = i;
                if (endIdx - startIdx + 1 < minLength) {
                    minLength = endIdx - startIdx + 1;
                }
            }
        }
        
        if (startIdx == -1) {
            return new int[]{-1};
        } else {
            return Arrays.copyOfRange(arr, startIdx, endIdx+1);
        }
    }
}
