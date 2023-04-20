package Programmers.레벨1.나머지가1이되는수찾기;

import java.util.ArrayList;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 1){
                list.add(i);
            }
        }
        answer = list.get(0);
        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution(10);
    }
}
