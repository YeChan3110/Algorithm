package Programmers.배열의유사도;

import java.util.HashSet;

public class Solution {
    public int solution(String[] s1, String[] s2){
        int answer = 0;

        HashSet hs = new HashSet<>();

        for(String str : s1){
            hs.add(str);
        }

        for(String str : s2){
            if(hs.contains(str)){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"a","b","d"};
        String[] b = {"a","d","c"};
        int sl = new Solution().solution(a, b);
        System.out.println(sl);
    }
}
