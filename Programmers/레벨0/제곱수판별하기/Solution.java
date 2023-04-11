package Programmers.레벨0.제곱수판별하기;

public class Solution {
    public int solution(int n){
        int i = (int) Math.sqrt(n);
        if(i * i == n){
            return 1;
        }else{
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solution(144));
    }
}
